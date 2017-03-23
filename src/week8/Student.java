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
public class Student extends person{
    
    public int id;
    public String major;
    
    Student()
    {
        super();
        this.id = 15992;
        this.major = "Computer Science";
    }
    
    Student(String name,String address,int phoneno,int id,String major)
    {
        super(name,address,phoneno);
        this.id = id;
        this.major = major;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    public void setMajor(String major)
    {
        this.major = major;
    }
    public int getID()
    {
        return this.id;
    }
    public String getMajor()
    {
        return this.major;
    }
    public  void DispalyDetailsStudent()
    {
        super.displaydetials();
        System.out.println("ID number: "+id);
        System.out.println("Major: "+major);
    }
    
  @Override
    public void toString(String name){
        
                System.out.println(name);
    }
}
