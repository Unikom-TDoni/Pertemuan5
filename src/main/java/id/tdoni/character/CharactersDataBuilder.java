/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.character;

final class CharactersDataBuilder {

    private String nama;
    private int nyawa;
    private int jutsuDamage;
    private JutsuElement natureType;

    CharactersDataBuilder setNama(String nama) {
        this.nama = nama;
        return this;
    }

    CharactersDataBuilder setNyawa(int nyawa) {
        this.nyawa = nyawa;
        return this;
    }

    CharactersDataBuilder setJutsuDamage(int jutsuDamage) {
        this.jutsuDamage = jutsuDamage;
        return this;
    }

    CharactersDataBuilder setJutsuElement(JutsuElement natureType) {
        this.natureType = natureType;
        return this;
    }

    CharactersData createCharacterData() {
        return new CharactersData(nama, nyawa, jutsuDamage, natureType);
    }
}
