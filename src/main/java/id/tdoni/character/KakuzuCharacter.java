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
public final class KakuzuCharacter extends Characters {
    @Override
    protected CharactersData buildCharactersData() {
        return new CharactersDataBuilder()
                .setNama("Kakuzu")
                .setNyawa(120)
                .setJutsuDamage(10)
                .setJutsuElement(JutsuElement.EARTH)
                .createCharacterData();
    }
}
