package firstJava.project.springboot_first_app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "items") // Optional, table name database mein kya hoga
public class Item {

    @Id
    private Long id; // primary key hona zaroori hai

    private String name;
    private double price;

    // Constructor (no-args)
    public Item() {
    }

    // Constructor (all fields)
    public Item(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters (required for JPA)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
