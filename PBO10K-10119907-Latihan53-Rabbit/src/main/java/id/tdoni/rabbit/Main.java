/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.rabbit;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan data kelinci
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tampilkanDataRabbit(buatRabbit());
    }
    
    private static Rabbit buatRabbit() {
        return new Rabbit(false, "grass", 4);
    }
    
    private static void tampilkanDataRabbit(Rabbit rabbit) {
        var name = rabbit.getName();
        System.out.printf("Hello, His name is %s\n", name);
        System.out.printf("%s is Vegetarian? %s\n", name, rabbit.isVegetarian());
        System.out.printf("%s eats %s\n", name, rabbit.getEats());
        System.out.printf("%s has %d legs.\n", name, rabbit.getNoOfLegs());
        System.out.printf("%s color is %s\n", name, rabbit.getColor());
    }
    
}
