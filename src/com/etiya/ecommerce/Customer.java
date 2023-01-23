package com.etiya.ecommerce;

// class isimleri = PascalCase
public class Customer {
    // constant, sabitler = UPPERCASE
    static final int MINIMUM_AGE=18;

    // değişkenler = camelCase
    public int id;
    public String firstName;
    public String lastName;
    public String nationalityId;
    public String email;

    public Customer(int id, String firstName, String lastName, String nationalityId, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.email = email;
    }

    // fonksiyonlar = camelCase
    void makeOrder()
    {
        System.out.println("Order placed..");
    }
}
