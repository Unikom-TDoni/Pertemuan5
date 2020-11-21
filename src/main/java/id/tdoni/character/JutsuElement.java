/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.character;

/**
 *
 * @author ACER
 */
public enum JutsuElement {
    NONE,
    FIRE,
    WATER,
    WIND,
    EARTH;
    
    static {
        NONE.strengthElement = NONE;
        FIRE.strengthElement = WIND;
        WATER.strengthElement = FIRE;
        WIND.strengthElement = EARTH;
        EARTH.strengthElement = WATER;
    }
    
    private JutsuElement strengthElement;
    
    public JutsuElement getStrengthElement() {
        return strengthElement;
    }
}
