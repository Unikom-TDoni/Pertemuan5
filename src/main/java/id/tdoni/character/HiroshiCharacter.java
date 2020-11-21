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
public final class HiroshiCharacter extends Characters {
    
    @Override
    protected CharactersData buildCharacterData() {
        return new CharactersDataBuilder()
                .setNamaLengkap("Hiroshi Agasa")
                .setUmur(53)
                .setGender(Gender.PRIA)
                .setBerat(70)
                .setTinggi(160)
                .createCharacterData();
    }
    
}
