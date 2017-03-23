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
public class SportsCar extends car{
    
    private String suspension;

    public SportsCar() {
        super();
        this.suspension ="4";
    }

    public SportsCar(String suspension, int rmp, int gear, int speed) {
        super(rmp, gear, speed);
        this.suspension = suspension;
    }
    

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }
    
    
    public String getSuspension() {
        return suspension;
    }

    @Override
    public void printDescription() {
        System.out.println("Sport car-----------");
        super.printDescription(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Suspension:"+this.suspension);
    }
    
}
    
     
