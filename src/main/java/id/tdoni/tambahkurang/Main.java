/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.tambahkurang;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan hasil peritungan bilangan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var jumlahBilangan = new JumlahBilangan();
        var selisihBilangan = new SelisihBilangan();
        jumlahBilangan.tampilHasilJumlah();
        selisihBilangan.tampilSelisih();
    }
}
