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
public final class KisameCharacter extends Characters {
    @Override
    protected CharactersData buildCharactersData() {
        return new CharactersDataBuilder()
                .setNama("Kisame Hoshigaki")
                .setNyawa(150)
                .setJutsuDamage(5)
                .setJutsuElement(JutsuElement.WATER)
                .createCharacterData();
    }
}
