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
public class Employee extends person{
    public int employeenumber;
    public int salary;
    
    Employee()
    {
        super();
        this.employeenumber = 12345;
        this.salary = 5000;
    }
    Employee(String name,String address,int phoneno, int employeenumber,int salary)
    {
        super(name,address,phoneno);
        this.employeenumber = employeenumber;
        this.salary = salary;
    }
    public void setEmpnumber(int empnumber)
    {
        this.employeenumber = empnumber;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    public int getEmpnumber()
    {
        return this.employeenumber;
    }
    public int getSalary()
    {
        return this.salary;
    }
    
    public void Displayemployee()
    {
        super.displaydetials();
        System.out.println("Empoyee Number:" + this.employeenumber);
        System.out.println("Salary :" +this.salary);
    }
    @Override
    public void toString(String name)
    {
                System.out.println(name);
    }
   
}
