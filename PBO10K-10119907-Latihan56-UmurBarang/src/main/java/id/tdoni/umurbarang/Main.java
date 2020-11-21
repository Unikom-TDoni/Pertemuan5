/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.umurbarang;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan data barang antik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tampilkanDataRadio(buatRadio());
    }
    
    private static Radio buatRadio() {
        var radio = new Radio(234);
        radio.setNama("Radio AM");
        return radio;
    }
    
    private static void tampilkanDataRadio(Radio radio) {
        System.out.println("Nama barang Antik : ".concat(radio.getNama()));
        radio.tampilUmur();
    }
}
