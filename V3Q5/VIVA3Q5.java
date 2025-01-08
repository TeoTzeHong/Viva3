/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva3q5;

import java.util.Scanner;
import java.util.ArrayList;
public class VIVA3Q5 {

   
    public static void main(String[] args) {
       
        Bank bank = new Bank("Simple Bank");
        System.out.println("Welcome to Simple Bank");
        
        Customer c1 = new Customer("John Doe","C001");
        bank.addCustomer(c1);
        System.out.println("Creating a new customer: "+c1.getName()+" (ID: "+c1.getCustomerId()+")");
        
        System.out.println("Adding a savings account for "+c1.getName()+" with account number");
        BankAccount acc1 = new BankAccount("A1001","John Doe",500);
        c1.addAccount(acc1);
        System.out.println(acc1.getAccountNumber()+" and an initial deposit of $"+acc1.getBalance());
        
        acc1.deposit(200);
        System.out.println("Depositing $200 into account "+acc1.getAccountNumber()+" ...");
        System.out.println("New balance: $"+acc1.getBalance());
        
        if(acc1.withdraw(100))
            System.out.println("Withdrawing $100 from account "+acc1.getAccountNumber()+" ...");
        else
            System.out.println("Fail to withdraw, the balance remain is not enough to withdraw.");
        System.out.println("New balance: $"+acc1.getBalance());
        
        c1.displayAccounts();
        System.out.println("");
        bank.displayAllCustomers();
        
        
        
    }
    
}
