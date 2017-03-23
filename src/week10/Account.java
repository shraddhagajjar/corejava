/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author shraddha
 */
import java.util.*;
public class Account {
    public String name;
    public int accountnumber;
    public double balance;
    public static Scanner in = new Scanner(System.in);
    Account()
    {
        this.name = "Shraddha";
        this.accountnumber=15992;
        this.balance = 500;
    }
    Account(String name,int accountnumber,double balance)
    {
        this.name = name;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }
   
    Account(String name,int accountnumber)
    {
        this.name = name;
        this.accountnumber = accountnumber;
        
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAccountnumber(int accountno)
    {
        this.accountnumber = accountno;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public String getName()
    {
        return (this.name);
    }
    public int getAccountnumber()
    {
        return this.accountnumber;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public void depositeAmount(double money)
    {
        this.balance +=  money; 
        displayBalance();
        
    }
    public void withdraw(double wmoney)
    {
        if(this.balance >= (this.balance-wmoney))
        {
            System.out.println("Your transaction is done");
            this.balance = this.balance-wmoney;
            displayBalance();
        }
        else
        {
            System.out.println("Sorry you cannot get more money then your balance");       
            displayBalance();
        }
    }
    
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
