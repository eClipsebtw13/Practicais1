package org.ulpgc.is1.trabajopractico.model;

import java.util.ArrayList;

public class Customer {
    public ArrayList<Address> address;
    public String name, surname;

    void addAddress(String street, String city, int number, int postalCode) {
        Address a = new Address (street, city, number, postalCode);
        address.add(a);

    }
    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}


