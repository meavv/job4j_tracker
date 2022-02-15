package ru.job4j.tracker;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;
import java.util.stream.Collectors;

public class HbmTracker implements Store, AutoCloseable {

    private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure().build();
    private final SessionFactory sf = new MetadataSources(registry)
            .buildMetadata().buildSessionFactory();

    @Override
    public void init() {

    }

    @Override
    public Item add(Item item) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(item);
        session.getTransaction().commit();
        session.close();
        return item;
    }

    @Override
    public boolean replace(int id, Item item) {
        Session session = sf.openSession();
        session.beginTransaction();
        String hql = "update ru.job4j.tracker.Item set name = :nameParam, "
                + "description = :descriptionParam,"
                + " created = :createdParam where id = :idParam";
        var query = session.createQuery(hql);
        query.setParameter("nameParam", item.getName());
        query.setParameter("descriptionParam", item.getDescription());
        query.setParameter("createdParam", item.getCreated());
        query.setParameter("idParam", id);
        int result = query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return result != 0;
    }

    @Override
    public boolean delete(int id) {
        Session session = sf.openSession();
        session.beginTransaction();
        String hql = "delete ru.job4j.tracker.Item where id = :idParam";
        var query = session.createQuery(hql);
        query.setParameter("idParam", id);
        int result = query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return result != 0;
    }

    @Override
    public List<Item> findAll() {
        Session session = sf.openSession();
        session.beginTransaction();
        List result = session.createQuery("from ru.job4j.tracker.Item").list();
        session.getTransaction().commit();
        session.close();
        return result;
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> result = findAll();
        return result.stream()
                .filter(a -> a.getName().contains(key))
                .collect(Collectors.toList());
    }

    @Override
    public Item findById(int id) {
        Session session = sf.openSession();
        session.beginTransaction();
        Item result = session.get(Item.class, id);
        session.getTransaction().commit();
        session.close();
        return result;
    }

    @Override
    public void close() throws Exception {
        StandardServiceRegistryBuilder.destroy(registry);
    }
}