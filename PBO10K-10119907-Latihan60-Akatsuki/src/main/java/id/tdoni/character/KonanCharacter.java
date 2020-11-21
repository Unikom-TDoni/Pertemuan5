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
public final class KonanCharacter extends Characters {
    @Override
    protected CharactersData buildCharactersData() {
        return new CharactersDataBuilder()
                .setNama("Konan")
                .setNyawa(80)
                .setJutsuDamage(20)
                .setJutsuElement(JutsuElement.WIND)
                .createCharacterData();
    }
}
