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
public class car {
    private int rpm;
    private int gear;
    private int speed;
    
    car()
    {
        this.rpm = 500;
        this.gear = 8;
        this.speed = 500;
    }
    car(int rmp,int gear,int speed)
    {
        this.rpm = rmp;
        this.gear = gear;
        this.speed = speed;
    }
    public void setRpm(int rpm)
    {
        this.rpm = rpm;
    }
    public void setGear(int gear)
    {
        this.gear = gear;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public int getRpm()
    {
        return this.rpm;
    }
    public int getGear()
    {
        return this.gear;
    }
    public int getSpeed()
    {
        return this.speed;
    }
    public void printDescription()
    {
        //System.out.println("Details of Car super Class");
        System.out.println("Car rpm :" +this.rpm);
        System.out.println("Car speed :" +this.speed);
        System.out.println("Car Gear :" +this.speed);
    }
    
}
