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
public class RegularCar extends car{
    private int tireWidth;

    public RegularCar() {
        super();
        this.tireWidth = 20;
    
    }

    public RegularCar(int tireWidth, int rmp, int gear, int speed) {
        super(rmp, gear, speed);
        this.tireWidth = tireWidth;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    
    public int getTireWidth() {
        return tireWidth;
    }

    @Override
    public void printDescription() {
        System.out.println("Regular Car--------------");
        super.printDescription(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Tiredate Details:" +this.tireWidth);
    }
    
    
}
