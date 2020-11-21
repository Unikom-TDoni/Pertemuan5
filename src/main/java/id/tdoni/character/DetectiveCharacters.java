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
public abstract class DetectiveCharacters extends Characters {
    
    private final DetectiveCharactersData detectiveCharactersData = buildDetectiveCharactersData();
    
    protected abstract DetectiveCharactersData buildDetectiveCharactersData();

    @Override
    public void tampilkanDataCharacter() {
        super.tampilkanDataCharacter();
        System.out.printf("Nickname : %s\n", detectiveCharactersData.nickName);
        System.out.printf("Teritory : %s\n", detectiveCharactersData.teritory);
        System.out.printf("Total Kasus Terselesaikan : %d Kasus\n", detectiveCharactersData.totalKasusTerselesaikan);
    }
}
