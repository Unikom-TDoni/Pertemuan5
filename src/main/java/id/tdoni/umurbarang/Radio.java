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
public class Radio extends BarangAntik {

    private String nama;

    public Radio(int umur) {
        super(umur);
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
