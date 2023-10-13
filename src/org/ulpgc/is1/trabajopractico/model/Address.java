package org.ulpgc.is1.trabajopractico.model;

public class Address {

    private String city, street;
    private int number, postalCode;


    public Address(String city, String street, int number, int postalCode) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
