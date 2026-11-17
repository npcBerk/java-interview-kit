package interviewkit.spring.item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int quantity;

    protected Item() {}

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
}
