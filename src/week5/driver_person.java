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
public class driver_person {
    public static void main(String[] args)
    {
        person p = new person();
        p.display();
        person q = new person("Shraddha","fremont",23);
        q.display();
        
        q.setName("Pooja");
        
        q.setAddress("washington");
        
        q.setAge(27);
        q.display();
        
    }
    
}
