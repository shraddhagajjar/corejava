/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author shraddha
 */
public class circle {
    private float radius;
    private double area;
   private float perimeter;
    circle(){
        
    }
    circle(float radius)
    {
         this.radius = radius;
    }
    public void setRadius(float radius)
    {
        this.radius = radius;
    }
    
    //getter methods
    public float getRadius()
    {
        return (radius);
    }
    public double findArea()
    {
        this.area = 3.14*radius*radius; 
        return(this.area);
    }
    
    public float findperimeter()
    {
        this.perimeter =(float) (2 * 3.14 * radius);
        return(this.perimeter);
    }
    public void display()
    {
        System.out.println("Radius :" +radius);
        
        System.out.println("Area :" +area);
        
        System.out.println("Perimeter :" +perimeter);
    }
    
}
