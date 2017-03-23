/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;
import java.util.*;
/**
 *
 * @author shraddha
 */
public class Testaccount {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        String name = null;
        double balance;
        int account,type;
      
        account object1 = new checking();
        account object2 = new saveing();
       
       object1.display();
       object2.display();
        
        /*
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        String name = null;
        double balance;
        int account,type;
        account object1 = new checking();
        account object2 = new saveing();
            System.out.println("Enter Your name");
            name=in1.nextLine();
            System.out.println("Enter Account Number");
            account = in.nextInt();
            System.out.println("Press 1 for saveing aacount \nPress 2 for checking account \n ");
            
            while((type =in.nextInt()) != 3)
            {
                if(type == 1)
                {
                    System.out.println("Enter amount for saveing account");
                    balance = in.nextDouble();
                    object1 = new saveing(name, account, balance);
                    object1.display();
                    break;
                   
                }
                else if (type == 2)
                {
                    
                    System.out.println("Enter amount for checking account");
                    balance = in.nextDouble();
                    object2 = new checking(name, account, balance);
                    object2.display();
                    break;
                }
                else
                {
                    System.out.println("Enter proper value");
                }
            }
            
            
        System.out.println("Enter Account Number");
        account = in.nextInt();
            if(object1.getAccountNumber() == account)
            {
                System.out.println("Select choice which operation would like to perform");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposite");
                System.out.println("3. Intrest");
                System.out.println("4. Check you blance");
                System.out.println("5. For Exit");
                int no;
                while((no=in.nextInt()) != 5)
                {
                    if(no == 1)
                    {
                        System.out.println("Press 1 for saveing aacount \n Press 2 for checking account ");
                        type =in.nextInt();
                            if(type == 1)
                            {
                                System.out.println("WithDraw Amount");
                                balance = in.nextDouble();
                                 
                            }
                            else if (type == 2)
                            {
                                System.out.println("WithDraw");
                                balance = in.nextDouble();
                                a3.withdraw(balance);
                            }   
                            else
                            {
                                System.out.println("Enter proper value");
                            }
                        
                    }
                    else if(no == 2)
                    {
                        System.out.println("Press 1 for saveing aacount \n Press 2 for checking account");
                        type =in.nextInt();
                            if(type == 1)
                            {
                                System.out.println("Deposite Amount");
                                double amount = in.nextDouble();
                                a2.depositeAmount(amount);
                                break;
                            }
                            else if (type == 2)
                            {   
                                System.out.println("Deposite Amount");
                                balance = in.nextDouble();
                                a3.depositeAmount(balance);
                                
                            }
                            else
                            {
                                System.out.println("Enter proper value");
                            }
                        
                    }
                    else if(no == 3)
                    {
                        System.out.println("Your balance with total interest is :" );
                        a1.addinterest();
                    }
                    else if(no == 4)
                    {
                        double checking = a2.getBalance();
                        double saveing = a3.getBalance();
                        double total = checking + saveing;
                        a2.displayBalance();
                        a3.displayBalance();
                        System.out.println("Yout total balance is :" +total);
                    }
                    else
                    {
                        System.out.println("Wrong choice");
                    }
                    
                    System.out.println("Select choice which operation would like to perform");
                    System.out.println("1. Withdraw");
                    System.out.println("2. Deposite");
                    System.out.println("3. Intrest");
                    System.out.println("4. Check you blance");
                    System.out.println("5. For Exit");
            
                }
            }
    }*/
    }
    
}
