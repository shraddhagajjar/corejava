/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_11;

/**
 *
 * @author shraddha
 */
public class savingAccount extends Account{ 
    
    public double balance;
    public savingAccount() {
    }

    public savingAccount(String name, double accountnumber, double balance) {
        super(name, accountnumber, balance);
        this.balance = balance;
        
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getAccountnumber() {
        return super.getAccountnumber(); //To change body of generated methods, choose Tools | Templates.
    }

    public double getBalance() {
        return this.balance; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAccountnumber(double accountnumber) {
        super.setAccountnumber(accountnumber); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBalance(double balance) {
        super.setBalance(balance);
        this.balance = balance;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    void display() {
        
        System.out.println(this.name + " Your total balance is :"+this.balance);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    public void addinterest()
    {
        this.balance += 0.30*this.balance;
        System.out.println("You balance after adding interest is" +this.balance);
    }
    

    @Override
    void withdraw(double amount) {
         if(this.balance - amount > 10)
        {
            this.balance = this.balance - amount;
            display();
        }
        else
        {
            System.out.println("Transcation is not proceed due to less balance");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
    
}
