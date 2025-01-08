/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3q5;

public class BankAccount {
    private String accountNumber, accountHolderName;
    private double balance=0;
    
    public BankAccount(String accountNumber, String accountHolderName, double valueDeposit){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance+=valueDeposit;
    }
    
    public void deposit(double depositValue){
           this.balance+=depositValue;
    }
    
    public boolean withdraw(double amount){
        if (this.balance>=amount)
        {
            this.balance-=amount;
            return true;
        }
        else
            return false;
    }
    
    public String getAccountNumber(){
        return this.accountNumber;
    }
            
    public String  getAccountHolderName(){
        return this.accountHolderName;
    }
    
    public double getBalance(){
        return this.balance;
    }
}
