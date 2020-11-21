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
public class Vehicle {
 
    private String myBrand;
    private String myModel;
    
    public Vehicle() {
    }
    
    public String getModel() {
        return myModel;
    }

    public void setModel(String model) {
        myModel = model;
    }

    public String getBrand() {
        return myBrand;
    }

    public void setBrand(String brand) {
        myBrand = brand;
    }
}
