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
public class TestAll {
    public static  void main(String[] args)
    {
        person p = new person("Shraddha","Fremont",1234567890);
        Employee E = new Employee("Pooja","Settle", 1234567890,1007, 10000);
        Student S = new Student("Scott","Cal",1234567890, 15992,"Computer Science");
        System.out.println("------------------Person Object--------------");
        p.displaydetials();
        p.toString("This one is Person class  Shraddha");
        System.out.println("------------------Employee Object--------------");
        E.Displayemployee();
        E.toString("This one is Employee Pooja");
        System.out.println("------------------Student Object--------------");
        S.DispalyDetailsStudent();
        S.toString("This one is Student Scott");
     
    }
}
