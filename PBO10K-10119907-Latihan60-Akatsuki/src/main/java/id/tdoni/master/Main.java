/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.master;

import id.tdoni.battle.BattleSystem;
import id.tdoni.character.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan hasil battle antar anggota akatsuki
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("==== Battle Of Akatsuki ====");
        var scanner = new Scanner(System.in);
        var playerCharacter = pilihPlayerCharacter(scanner);
        var randomEnemyCharacter = getRandomEnemy(playerCharacter);
        var battleSystem = new BattleSystem(playerCharacter, randomEnemyCharacter);
        
        battleSystem.startBattle();
        battleSystem.showWinnerOfTheBattle();
    }
    
    private static Characters getRandomEnemy(Characters playerCharacters) {
        Characters[] characterCollection = {
            new ItachiCharacter(),
            new KakuzuCharacter(),
            new KisameCharacter(),
            new KonanCharacter()
        };
        
        var randomEnemy = characterCollection[new Random().nextInt(characterCollection.length)];
        return randomEnemy.getNama().equals(playerCharacters.getNama())? 
                getRandomEnemy(playerCharacters) : randomEnemy;
    }
    
    private static Characters pilihPlayerCharacter(Scanner scanner) {
        System.out.println("1. Uchiha Itachi");
        System.out.println("2. Kakuzu");
        System.out.println("3. Kisame Hoshigaki");
        System.out.println("4. Konan");
        System.out.println("Anda Memilih Character No : ");

        Characters[] characterCollection = {
            new ItachiCharacter(),
            new KakuzuCharacter(),
            new KisameCharacter(),
            new KonanCharacter()
        };
        
        var userSelectedPlayerId = scanner.nextInt();
        
        if(userSelectedPlayerId <= characterCollection.length && userSelectedPlayerId > 0)
            return characterCollection[userSelectedPlayerId - 1];
        
        System.out.println("\nPilihan Yang Anda Masukan Tidak Valid Silahkan Coba Lagi\n");
        return pilihPlayerCharacter(scanner);
    }
}