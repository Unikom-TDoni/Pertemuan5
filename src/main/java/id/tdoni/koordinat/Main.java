/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.koordinat;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan data warna koordinat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tampilkanDataWarnaKoordinat(buatWarnaKoordinat());
    }
 
    private static WarnaKoordinat buatWarnaKoordinat() {
        return new WarnaKoordinat(10, 4, "Jingga");
    }
    
    private static void tampilkanDataWarnaKoordinat(WarnaKoordinat warnaKoordinat) {
        System.out.println("Warna Koordinat : ".concat(warnaKoordinat.getNamaWarna()));
        System.out.printf("Koordinat Sumbu x : %d, y : %d", warnaKoordinat.getX(), warnaKoordinat.getY());
    }
    
}
