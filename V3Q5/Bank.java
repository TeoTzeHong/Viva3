/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q5;

import java.util.ArrayList;


public class Bank {
    private String bankName;
    private ArrayList<Customer> customers = new ArrayList<>();
    
    public Bank(String name){
        this.bankName = name;
    }
    
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    
    public Customer getCustomer(String customerId){
        for(int i=0;i<customers.size();i++)
        {
            if(customers.get(i).getCustomerId().equals(customerId))
            {
                return customers.get(i);
            }
        }
        return null;
    }
    
    public  void displayAllCustomers(){
        System.out.println("Displaying all accounts for customer of "+this.bankName);
        for(int i=0;i<customers.size();i++)
        {
            System.out.print("Customer: "+customers.get(i).getName()+", ");
            System.out.print("Id: "+customers.get(i).getCustomerId());
        }
    }
}
