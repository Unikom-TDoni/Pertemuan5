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
public abstract class Characters {
    private final CharactersData characterData = buildCharactersData();
    
    protected abstract CharactersData buildCharactersData();
    
    public void attack() {
        System.out.printf("=> %s Attack <=\n", characterData.nama);
    }
    
    public void takeDamage(int damage) {
        characterData.nyawa -= damage;
        System.out.printf("%s Take %d Damage\n", characterData.nama, damage);
        System.out.printf("Current Hp %s Is %d\n\n", characterData.nama, characterData.nyawa);
    }
    
    public int getNyawa() {
        return characterData.nyawa;
    }
    
    public String getNama() {
        return characterData.nama;
    }
    
    public int getJutsuDamage() {
        return characterData.jutsuDamage;
    }
    
    public JutsuElement getJutsuElement() {
        return characterData.jutsuElement;
    }
}
