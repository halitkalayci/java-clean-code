import com.etiya.ecommerce.*;
import liskov.substitution.BaseCoffeMachine;
import liskov.substitution.CoffeMachine;
import liskov.substitution.PremiumCoffeMachine;

import java.io.File;

public class Main {
    public static void main(String[] args)
    {
        CustomerService customerService = new CustomerManager(new ConsoleLogger());
        // Database'e logla
        customerService.add(new Customer(1,"Halit","Kalayci","12345678901","halit@gmail.com"));


        // Admin panelden çağrıldı..
        // File'a logla..
        CustomerService customerService2 = new CustomerManager(new DatabaseLogger());
        customerService2.add(new Customer(2,"İrem","Balcı","12345678902","irem@kodlama.io"));
    }
}