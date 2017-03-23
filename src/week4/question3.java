/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.*;
/**
 *
 * @author 15992gs
 */
public class question3 {
    public static void main(String[] args)
    {
        int i,count=0;
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(i=1;i<=a;i++)
        {
           if(a%i==0)
           {
              count++; 
               
           }
        }
        if(count==2)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is compostite");
        }
    }
}
