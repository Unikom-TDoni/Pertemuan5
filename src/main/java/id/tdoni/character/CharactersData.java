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
final class CharactersData {
    int nyawa;
    final String nama;
    final int jutsuDamage;
    final JutsuElement jutsuElement;
    
    CharactersData(String nama, int nyawa, int jutsuDamage, JutsuElement natureType) {
        this.nama = nama;
        this.nyawa = nyawa;
        this.jutsuDamage = jutsuDamage;
        this.jutsuElement = natureType;
    }
}