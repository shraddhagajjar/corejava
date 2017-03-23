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
public class person {
    //data fields
    //contructor
    //setter or accesstor arguments no return value 
    //getter only return value
    //genric class
    //if we dont have default or udf contruter  then complier create by default
    private String name; //know as encapsulation
    private String address; 
    private int age;
    //contructor user defined
    person()
    {
        
    }
    person(String name,String address,int age)
    {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    
    //setter or accesstor
    public  void setName(String name)
    {
        this.name = name;
    }
    
    public  void setAddress(String Address)
    {
        this.address =  Address;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    //getter methods
    public String getName()
    {
        return (name);
    }
    
    public String getAddress()
    {
        return (address);
    }
    
    public int getAge()
    {
        return (age);
    }
    
    //diplay method for all field of class
    public void display()
    {
        System.out.println("Name:" +name);
        
        System.out.println("Addres:" +address);
        
        System.out.println("Age:" +age);
    }
    //contructor  two types 
    //deafult 
    //constuctor job is inatialization
    //cons. name same as class name,variable name is same as class variable
    
}
