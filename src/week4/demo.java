/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author shraddha
 */
public class demo {
     public static void main(String[] args)
    {
        
        int i=0,j=0,k=0;
        for (i=1; i<10; i += 2)
        {
            for (k=0; k<i; k++)
            {
                 System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (i=1; i<10; i += 2)
        {
            for ( j=0; j < (4 - i / 2); j++)
            {
                System.out.print(" * ");
            }
             System.out.println(" ");
        }
        for (i=1; i<10; i += 2)
        {
            for ( j=0; j < (4 - i / 2); j++)
            {
                System.out.print(" ");
            }
            for (k=0; k<i; k++)
            {
                 System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    
}
