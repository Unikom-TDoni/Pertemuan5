/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.battle;
import id.tdoni.character.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ACER
 */
public final class BattleSystem {
    
    private final Characters enemy;
    private final Characters player;
    private final int minimumNyawa = 0;
    private final int bonusElementDamage = 5;
    
    public BattleSystem(Characters player, Characters enemy) {
        this.player = player;
        this.enemy = enemy;
    }
    
    public void startBattle() throws InterruptedException {
        System.out.println("\n===== Battle Start =====");
        var calculatedPlayerDamage = calculateCharacterElementDamage(player, enemy);
        var calculatedEnemyDamage = calculateCharacterElementDamage(enemy, player);
        while (player.getNyawa() > minimumNyawa && enemy.getNyawa() > minimumNyawa) {
            player.attack();
            enemy.takeDamage(calculatedPlayerDamage);
            TimeUnit.SECONDS.sleep(1);
            if (enemy.getNyawa() > minimumNyawa) {
                enemy.attack();
                player.takeDamage(calculatedEnemyDamage);
            }
        }
    }
    
    public void showWinnerOfTheBattle() {
        if(enemy.getNyawa() <= minimumNyawa)
            System.out.printf("Selamat Anda Menang Melawan : %s", enemy.getNama());
        else 
            System.out.printf("Sayang Sekali Anda Dikalahkan Oleh : %s", enemy.getNama());
    }
    
    private int calculateCharacterElementDamage(Characters firstChara, Characters secondChara) {
        var jutsuElement = firstChara.getJutsuElement();
        var jutsuDamage = firstChara.getJutsuDamage();
        return jutsuElement.getStrengthElement().equals(secondChara.getJutsuElement()) ?
                jutsuDamage + bonusElementDamage : jutsuDamage;
    }
}
