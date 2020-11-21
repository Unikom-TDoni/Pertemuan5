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
public final class EdogawaCharacter extends DetectiveCharacters {
    
    @Override
    protected CharactersData buildCharacterData() {
        return new CharactersDataBuilder()
                .setNamaLengkap("Edogawa Conan")
                .setUmur(6)
                .setGender(Gender.PRIA)
                .setBerat(18)
                .setTinggi(95)
                .createCharacterData();
    }

    @Override
    protected DetectiveCharactersData buildDetectiveCharactersData() {
        return new DetectiveCharactersDataBuilder()
                .setNickName("The Great Detective of the East")
                .setTeritory("Tokyo")
                .setTotalKasusTerselesaikan(600)
                .createDetectiveData();
    }
}
