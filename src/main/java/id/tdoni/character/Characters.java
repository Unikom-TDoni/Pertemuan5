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
public abstract class Characters {
    private final CharactersData characterData = buildCharacterData();
    
    protected abstract CharactersData buildCharacterData();

    public void tampilkanDataCharacter() { 
        System.out.println("====== Data Character ======");
        System.out.printf("Nama Lengkap : %s\n", characterData.namaLengkap);
        System.out.printf("Umur : %d\n", characterData.umur);
        System.out.printf("Gender : %s\n", characterData.gender);
        System.out.printf("Berat Badan : %.1f Kg\n", characterData.berat);
        System.out.printf("Tinggi Badan : %.1f Cm\n", characterData.tinggi);
    };
}