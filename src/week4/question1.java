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
public class question1 {
    public static void main(String[] args)
    {
        int a[]= new int[10];
        int i;
        Scanner input = new Scanner(System.in);
        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter value of a["+i+"]:");
            a[i] = input.nextInt();
        }
        System.out.println("=====Display Array====");
        for(i=0;i<a.length;i++)
        {
            System.out.println("Value of a["+i+"]:" +a[i]);
        }
        
        System.out.println("======Reverse Array=====");
        for(i=9;i>0;i--)
        {
            System.out.println("Reverse Array a["+i+"]:"+a[i]);
        }
    }
}
