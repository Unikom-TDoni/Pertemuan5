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
public final class RanCharacter extends Characters {

    @Override
    protected CharactersData buildCharacterData() {
        return new CharactersDataBuilder()
                .setNamaLengkap("Ran Mouri")
                .setUmur(17)
                .setGender(Gender.WANITA)
                .setBerat(52)
                .setTinggi(160)
                .createCharacterData();
    }
}
