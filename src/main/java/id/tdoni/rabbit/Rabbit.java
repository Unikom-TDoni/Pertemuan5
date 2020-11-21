/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.rabbit;

/**
 *
 * @author ACER
 */
public class Rabbit extends Animal {
    
    private String color = "Grey";
    private String name = "Peter";
    
    public Rabbit(boolean vegetarian, String food, int legs) {
        super(vegetarian, food, legs);
    }
    
    public String getColor() {
        return color;
    }
    
    public String getName() {
        return name;
    }
}
