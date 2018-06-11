package test.db;

import java.util.Set;

import org.springframework.data.annotation.Id;

public class Customer {

    @Id
    public String id;
    
    public String firstName;
    public String lastName;
    
    public Set<Customer> childs;
    
    
    public Customer() {}

    public Customer(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    public Set<Customer> getChilds() {
        return childs;
    }

    public void setChilds(Set<Customer> childs) {
        this.childs = childs;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
    
   
}
