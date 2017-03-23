/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author shraddha
 */
abstract public class account {
    public String name;
    public int accountNumber;
    public double balance;

    public account() {
        
    }

    public account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    
    public void depositeAmount(double money)
    {
        this.balance +=  money; 
        displayBalance();
        
    }
    
    abstract public void withdraw(int amount);
    abstract public void display();
    
    
    public void addinterest()
    {
       double interest = this.balance * 0.5;
        System.out.println("Interest amount is:" +interest);
        this.balance +=interest;
        
    }
    public void displayBalance()
    {
        System.out.println(this.name +"Your Courent Balance is :" +this.balance);
    }
    
}
