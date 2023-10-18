package org.ulpgc.is1.trabajopractico.model;

public class Dish {

    private String name, description;
    private int price;
    private OrderItem item;

    public Dish(String name, String description, int price, OrderItem item) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
