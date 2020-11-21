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
public class Skateboard extends Vehicle{
  
    private double myBoardLength;
    
    public Skateboard() {
        System.out.println("SkateBoard");
    }
    
    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double oardLength) {
        myBoardLength = oardLength;
    }
}
