/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.siapakamu;

/**
 *
 * @author ACER
 */
public class Manusia {
    protected String nama;
    protected int umur;
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
   
    public void siapaKamu() {
        System.out.println("Saya manusia");
    }
}
