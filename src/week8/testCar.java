/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author shraddha
 */
public class testCar {
    
    public static void main(String[] args) {

        
        car[] carlist = new car[3];
        carlist[0] = new car(10, 20, 90);
        carlist[1] = new RegularCar(10, 20, 10, 100);
        carlist[2] = new SportsCar("Three", 4, 15, 250);
        for(int i=0; i<carlist.length;i++)
        {
            System.out.println("------Details-------");
            carlist[i].printDescription();
        }
    }
    
}
