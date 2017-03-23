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

public class question2 {

    public static int indexofSamllelement(int[] a)
    {
        int i=0,min,index=0;
        min=a[0];
        for(i=0;i<a.length;i++)
        {
            if(min > a[i])
            {
                min = a[i];
                index = i;
            }
        }
        return index;  
    }
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
        int j = indexofSamllelement(a);
        System.out.println("Smallest element at :"+j);
        
    }
}
