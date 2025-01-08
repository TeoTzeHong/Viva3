/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q5;

import java.util.ArrayList;


public class Customer {
    private String name;
    private String customerId;
    private ArrayList<BankAccount> accounts = new ArrayList<>(); 
    
    public Customer(String name, String customerId){
        this.name = name;
        this.customerId = customerId;
    }
       
    public void addAccount (BankAccount account){
        this.accounts.add(account);
    }
    
    public BankAccount getAccount(String accountNumber){
        for(int i=0;i<accounts.size();i++)
        {
            if(accounts.get(i).getAccountNumber().equals(accountNumber))
            {
                return accounts.get(i);
            }
        }
        return null;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCustomerId(){
        return this.customerId;
    }
    
    public void displayAccounts(){
        System.out.println("Displaying all accounts for customer " + this.name);
        for(int i =0;i<accounts.size();i++)
        {
            System.out.print("Account number: "+ this.accounts.get(i).getAccountNumber()+", ");
            System.out.print("Balance: "+ this.accounts.get(i).getBalance());
        }
    }
        
}
