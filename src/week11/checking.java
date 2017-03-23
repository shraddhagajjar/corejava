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
public class checking extends account{

    public checking() {
        
    }

    public checking(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    
    public void depositeAmount(double money)
    {
        this.balance +=  money; 
            displayBalance();
        
    }
    
    public void addinterest()
    {
       double interest = this.balance * 0.5;
        System.out.println("Interest amount is:" +interest);
        this.balance +=interest;
        
    }
    public void displayBalance()
    {
        System.out.println("Your Saving Account Balance is :" +this.balance);
    }
    @Override
    public void withdraw(int amount) {
            if(this.balance >= (this.balance-amount))
        {
            System.out.println("Your transaction is done");
            this.balance = this.balance-amount;
            displayBalance();
        }
        else
        {
            System.out.println("Sorry you cannot get more money then your balance");       
            displayBalance();
        }
   
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("Your Checking Account Courrent Balance is :" +this.balance);
            
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
