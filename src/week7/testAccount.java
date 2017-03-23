/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author shraddha
 */
import java.util.*;
public class testAccount {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        String name = null;
        double balance;
        int account;
        System.out.println("Enter Number of person for account");
        int  acnumber = in.nextInt();
        Account[] a1 = new Account[acnumber];
        for(int i=0;i<acnumber;i++)
        {
            System.out.println("Enter Your name");
            name=in1.nextLine();
            System.out.println("Enter Account Number");
            account = in.nextInt();
            System.out.println("Enter Deposite balance");
            balance = in.nextDouble();
            a1[i] = new Account(name, account, balance);
        }
        System.out.println("Record of All member");
        System.out.println("\tName \t Account no");
        for(int i=0;i<a1.length;i++)
        {
            System.out.println("\t" +a1[i].getName()+"\t"+a1[i].getAccountnumber());
        }
        System.out.println("Enter Account Number");
        account = in.nextInt();
        for(int i=0; i<a1.length;i++)
        {
            if(a1[i].getAccountnumber() == account)
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
                        System.out.println("Enter amount that you want to withdraw");
                        double withdraw = in.nextDouble();
                        a1[i].withdraw(withdraw);
                    }
                    else if(no == 2)
                    {
                        System.out.println("Enter amount that you want to deposite");
                        double amount = in.nextDouble();
                        a1[i].depositeAmount(amount);
                    }
                    else if(no == 3)
                    {
                        System.out.println("Your balance with total inrest is :" );
                        a1[i].addinterest();
                    }
                    else if(no == 4)
                    {
                        a1[i].displayBalance();
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
            else
            {
                System.out.println("In correct ");
            }
        }
       a1[0].stringoperation(a1[0].getName(),a1[1].getName());
    }
    
}
