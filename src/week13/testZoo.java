/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

import java.util.Scanner;

/**
 *
 * @author shraddha
 */
public class testZoo {
    public static void main(String[] args) {
        Zoo z = new Zoo();
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        int l = 0;
       
        System.out.println("Enter how many number of animals you want to enter?");
        l = in.nextInt();
         String[] name = new String[l];
        System.out.println("Enter name of animal");
        for(int i=0;i<name.length;i++)
        {
            name[i]=in1.next();
        }
        for(int i=0;i<l;i++)
        {
            z.addanimal(name[i]);
        }
        
        z.printAnimal();
    }
}
