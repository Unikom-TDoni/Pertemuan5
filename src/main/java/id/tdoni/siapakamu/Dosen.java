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
public class Dosen extends Manusia {

    private String nip;
    private String mataKuliah;
  
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa() { 
        System.out.printf("Saya %s umur %d tahun sedang mengajar matakuliah %s\n", nama, umur, mataKuliah);
    }
    
    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
    
}
