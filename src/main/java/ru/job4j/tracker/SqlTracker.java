package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SqlTracker implements Store {

    private static Connection cn;

    public SqlTracker(Connection cn) {
        this.cn = cn;
    }

    public void init() {
        try (InputStream in = SqlTracker.class
                .getClassLoader().getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            cn = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void close() throws Exception {
        if (cn != null) {
            cn.close();
        }
    }

    @Override
    public Item add(Item item) throws Exception {
        try (PreparedStatement ps = cn.prepareStatement("insert into items (name, created) "
                + "values (?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, item.getName());
            ps.setTimestamp(2, Timestamp.valueOf((LocalDateTime.now())));
            ps.execute();
            try (ResultSet genKeys = ps.getGeneratedKeys()) {
                if (genKeys.next()) {
                    item.setId(genKeys.getInt(1));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public boolean replace(int id, Item item) {
        boolean result = false;
        try (PreparedStatement statement =
                     cn.prepareStatement("update items set name = ?, created = ? where id = ?")) {
            statement.setString(1, item.getName());
            statement.setTimestamp(2, Timestamp.valueOf((LocalDateTime.now())));
            statement.setInt(3, id);
            result = statement.executeUpdate() != 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(int id) {
        boolean result = false;
        try (PreparedStatement statement =
                     cn.prepareStatement("delete from items where id = ?")) {
            statement.setInt(1, id);
            result = statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Item> findAll() {
        List<Item> list = new ArrayList<>();
        try (PreparedStatement st = cn.prepareStatement("select * from items")) {
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Item(rs.getInt("id"), rs.getString("name"),
                        rs.getTimestamp("created"), rs.getString("description")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> list = new ArrayList<>();
        try (PreparedStatement st = cn.prepareStatement("select * from items where name like ?")) {
            st.setString(1, "%" + key + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Item(rs.getInt(1), rs.getString(2), rs.getTimestamp(3),
                        rs.getString(4)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Item findById(int id) {
        Item item = null;
        try (PreparedStatement st = cn.prepareStatement("select * from items where id = ?")) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                item = new Item(rs.getInt(1), rs.getString(2), rs.getTimestamp(3),
                        rs.getString(4));
                return item;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return item;
    }
}