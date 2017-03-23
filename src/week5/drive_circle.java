/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.*;
/**
 *
 * @author shraddha
 */
public class drive_circle {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius");
        float r = in.nextFloat();
        
              
            while(r<0)
            {
                
              System.out.println("Enter radius greater than");
              System.out.println("Enter Radius");
              r = in.nextFloat();
                    
            }
        
            circle s = new circle();
            circle s1 = new circle(r);
            s1.findArea();
            s1.findperimeter();
            s1.display();
        
    }
}
