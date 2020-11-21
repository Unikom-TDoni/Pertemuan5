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
public final class HattoriCharacter extends DetectiveCharacters {

    @Override
    public void tampilkanDataCharacter() {
        super.tampilkanDataCharacter();
    }
    
    @Override
    protected CharactersData buildCharacterData() {
        return new CharactersDataBuilder()
                .setNamaLengkap("Hattori Heiji")
                .setUmur(17)
                .setGender(Gender.PRIA)
                .setBerat(61)
                .setTinggi(174)
                .createCharacterData();
    }
    
    @Override
    protected DetectiveCharactersData buildDetectiveCharactersData() {
        return new DetectiveCharactersDataBuilder()
                .setNickName("The Great Detective of the West")
                .setTeritory("Osaka")
                .setTotalKasusTerselesaikan(1200)
                .createDetectiveData();
    }
}
