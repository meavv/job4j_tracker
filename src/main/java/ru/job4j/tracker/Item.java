package ru.job4j.tracker;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Entity
@Table(name = "items")
public class Item implements Comparable<Item> {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    private LocalDateTime created = LocalDateTime.now();

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name, Timestamp created, String description) {
        this.id = id;
        this.name = name;
        this.created = created.toLocalDateTime();
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return String.format("id: %s, name: %s, created: %s", id, name, FORMATTER.format(created));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return id == item.id && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Item o) {
        return CharSequence.compare(getName(), o.getName());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}