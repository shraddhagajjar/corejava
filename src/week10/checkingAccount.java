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
public class checkingAccount extends Account{

    public double balance;
    public checkingAccount() {
        super();
    }

    public checkingAccount(String name, int accountnumber, double  balance) {
        super(name, accountnumber);
        this.balance = balance;
    }
    
    
    public void setName(String name)
    {
        super.setName(name);
    }
    public void setAccountnumber(int accountno)
    {
        super.setAccountnumber(accountno);
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public String getName()
    {
        return (super.getName());
    }
    public int getAccountnumber()
    {
        return (super.getAccountnumber());
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
        System.out.println("Your Checking Account Courrent Balance is :" +this.balance);
    }
    
   
    
    
}
