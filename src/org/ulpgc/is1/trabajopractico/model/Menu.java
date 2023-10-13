package org.ulpgc.is1.trabajopractico.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<String> dishes;

    public Menu(String name, List<String> dishes) {
        this.name = name;
        this.dishes = new ArrayList<>();
    }

    public void addDish(String dish) {
        dishes.add(dish);
    }
}
