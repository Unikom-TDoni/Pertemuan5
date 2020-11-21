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
public final class ItachiCharacter extends Characters {
    @Override
    protected CharactersData buildCharactersData() {
        return new CharactersDataBuilder()
                .setNama("Uchiha Itachi")
                .setNyawa(100)
                .setJutsuDamage(12)
                .setJutsuElement(JutsuElement.FIRE)
                .createCharacterData();
    }
}
