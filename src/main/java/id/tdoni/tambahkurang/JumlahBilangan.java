/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.tambahkurang;

/**
 *
 * @author ACER
 */
public class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int hasilPenjumlahan = getX() + getY();
        System.out.println("Hasil Penjumlahan : ".concat(Integer.toString(hasilPenjumlahan)));
    }
}
