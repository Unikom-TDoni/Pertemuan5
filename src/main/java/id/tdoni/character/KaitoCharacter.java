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
public final class KaitoCharacter extends Characters {

    @Override
    protected CharactersData buildCharacterData() {
        return new CharactersDataBuilder()
                .setNamaLengkap("Kaito Kuroba")
                .setUmur(17)
                .setGender(Gender.PRIA)
                .setBerat(58)
                .setTinggi(174)
                .createCharacterData();
    }

}
