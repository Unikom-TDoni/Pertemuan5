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
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        int x = getX();
        int y = getY();
        int selisih = x - y;
        System.out.printf("Hasil Selisih %d - %d = %d", x, y, selisih);
    }
}
