/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.character;

/**
 *
 * @author ACER
 */
final class CharactersData {
    final String namaLengkap;
    final int umur;
    final float tinggi;
    final float berat;
    final Gender gender;
    
    CharactersData(String namaLengkap, int umur, float tinggi, float berat, Gender gender) {
        this.namaLengkap = namaLengkap;
        this.umur = umur;
        this.tinggi = tinggi;
        this.berat = berat;
        this.gender = gender;
    }
}
