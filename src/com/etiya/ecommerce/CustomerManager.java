package com.etiya.ecommerce;

import javax.xml.crypto.Data;
import java.io.File;

public class CustomerManager implements CustomerService{
    // SOLID PRINCIPLES
    // S = SINGLE RESPONSIBILITY PRINCIPLE
    // O = OPEN/CLOSE PRINCIPLE
    // L = Liskov Substitution Principle
    // I = Interface Segregation Principle
    // D = Dependency Inversion
    private Logger logger;
    public CustomerManager(Logger databaseLogger){
        logger=databaseLogger;
    }

    public void add(Customer customer){
        // her add methodu çağırıldığında loglama yapacağız..
        logger.log();

        validateCustomer(customer);
        checkIfCustomerExistsInDatabase(customer.firstName);
        System.out.println(customer.firstName + " başarıyla eklendi.");
    }
    public void delete(Customer customer){
        checkIfCustomerExistsInDatabase(customer.firstName);
        System.out.println(customer.firstName + " başarıyla silindi..");
    }

    void checkIfCustomerExistsInDatabase(String firstName)
    {
        boolean existsOnDatabase = false;
        if(existsOnDatabase)
        {
            throw new RuntimeException("Bu isimle bir müşteri zaten mevcut..");
        }
    }

    void validateCustomer(Customer customer)
    {
        // Customer'ı valide et..
        validateFirstName(customer.firstName);
        validateLastName(customer.lastName);
        validateNationalityId(customer.nationalityId);
    }

    void validateFirstName(String firstName){
        if(firstName == null || firstName == ""){
            throw new RuntimeException("İsim boş olamaz.");
        }
    }
    void validateLastName(String lastName){
        if(lastName == null || lastName == ""){
            throw new RuntimeException("Soyisim boş olamaz.");
        }
    }

    void validateNationalityId(String nationalityId){
        if(nationalityId == null || nationalityId.length() != 11){
            throw new RuntimeException("Lütfen geçerli bir TCKN giriniz");
        }
    }

}
