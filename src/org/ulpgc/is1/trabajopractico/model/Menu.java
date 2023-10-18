package org.ulpgc.is1.trabajopractico.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<Dish> dishes;
    private MenuType type;


    public Menu(String name, MenuType type) {
        this.name = name;
        this.dishes = new ArrayList<>(Dish);
        this.type = type;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }


}
