/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.umurbarang;

/**
 *
 * @author ACER
 */
public class BarangAntik {
    private int umur;
    
    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampilUmur(){
        System.out.printf("Umur barang antik ini adalah : %d tahun", umur);
    }
}
