/*
 * To change this
license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_11;

/**
 *
 * @author shraddha
 */
abstract public class Account {
    public String name;
    public double accountnumber;
    public double balance;

    public Account() {
    }

    public Account(String name, double accountnumber, double balance) {
        this.name = name;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountnumber(double accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getAccountnumber() {
        return accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
    public void deposite(double amount)
    {
        this.balance += amount;
    }
    abstract void withdraw(double amount);
    abstract void display();
    public double getbalance()
    {
        return this.balance;
    }
    public void addinterest()
    {
        this.balance += 0.30*this.balance;
        System.out.println("You balance after adding interest is" +this.balance);
    }
    
}
