package test.db;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbTestApplication implements CommandLineRunner{
        
    @Autowired
    private CustomerRepository repository;
    
    public static void main(String[] args) {
	SpringApplication.run(MongodbTestApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        //repository.deleteAll();
        Set<Customer> childs = new HashSet<>();
        Customer shakira = new Customer("Shakira", "Mebarak");
        Customer kaleh = new Customer("Kalect", "Mebarak");
        childs.add(kaleh);
        shakira.setChilds(childs);
        repository.save(shakira);
        
        
        
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for(Customer customer: repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();
        
        System.out.println("Customer found with findByFirstName('Mebarak'):");
        System.out.println("---------------------------------------------");
        for(Customer customer : repository.findByLastName("Mebarak")) {
            System.out.println(customer);
        }
    }
}
