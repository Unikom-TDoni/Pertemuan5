/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.vehicle;

/**
 *
 * @author ACER
 */
public class Bicycle extends Vehicle {

    private int myGearCount;
    
    public Bicycle() {
        System.out.println("Bicycle");
    }
    
    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int gearCount) {
        myGearCount = gearCount;
    }
}
