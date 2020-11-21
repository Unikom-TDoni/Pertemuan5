/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.master;

import id.tdoni.character.*;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menapilkan wikipedia dari anime conan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====== Character Wiki ======");
        var scanner = new Scanner(System.in);
        var selectedCharacter = pilihCharacter(scanner);
        tampilkanDataCharacter(selectedCharacter);
    }
    
    private static void tampilkanDataCharacter(Characters characters) {
        characters.tampilkanDataCharacter();
    }
    
    private static Characters pilihCharacter(Scanner scanner) {
        System.out.println("1. Edogawa Conan");
        System.out.println("2. Hattori Heiji");
        System.out.println("3. Kaito Kuroba");
        System.out.println("4. Ran Mouri");
        System.out.println("5. Hiroshi Agasa");
        System.out.println("Anda Memilih Character No : ");
        
        Characters[] characterCollection = {
            new EdogawaCharacter(),
            new HattoriCharacter(),
            new KaitoCharacter(),
            new RanCharacter(),
            new HiroshiCharacter()
        };

        var userSelectedPlayerId = scanner.nextInt();

        if(userSelectedPlayerId <= characterCollection.length && userSelectedPlayerId > 0)
            return characterCollection[userSelectedPlayerId - 1];
        
        System.out.println("\nPilihan Yang Anda Masukan Tidak Valid Silahkan Coba Lagi\n");
        return pilihCharacter(scanner);
    }
}
