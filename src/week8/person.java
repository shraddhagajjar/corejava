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
public class person {
    public String name;
    public String address; 
    public int phoneno;
    
    person()
    {
        this.name = "Shraddha";
        this.address = "Fremont";
        this.phoneno = 1234567890;
    }
    person(String name,String Addres,int phoneno)
    {
        this.name = name;
        this.address = "Fremont";
        this.phoneno = 1234567890;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setPhoneno(int phoneno)
    {
        this.phoneno = phoneno;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAdress()
    {
        return this.address;
    }
    public int getPhoneno()
    {
        return this.phoneno;
    }
    public void displaydetials()
    {
        System.out.println("Name:" + this.name);
        System.out.println("Adress:" +this.address);
        System.out.println("Phone number:" +this.phoneno);
    }
    
    public void toString(String name)
    {
        System.out.println(name);
        
    }
    
}
