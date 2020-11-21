/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung tunjangan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        var manager = buatManager(scanner);
        tampilkanHasilPerhitunganTunjangan(manager);
    }
    
    private static Manager buatManager(Scanner scanner) {
        var manager = new Manager();
        
        System.out.println("Masukan NIK : ");
        manager.setNik(scanner.nextLine());
        
        System.out.println("Masukan Nama : ");
        manager.setNama(scanner.nextLine());
        
        System.out.println("Masukan Golonan (1/2/3) : ");
        manager.setGolongan(scanner.nextInt());
        
        System.out.println("Masukan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(scanner.next());
        
        System.out.println("Masukan Jumlah Kehadiran : ");
        manager.setKehadiran(scanner.nextInt());
        
        return manager;
    }
    
    private static void tampilkanHasilPerhitunganTunjangan(Manager manager) {
        String nik = manager.getNik();
        String nama = manager.getNama();
        int golongan = manager.getGolongan();
        String jabatan = manager.getJabatan();
        int kehadiran = manager.getKehadiran();
        
        System.out.println();

        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t\t : ".concat(nik));
        System.out.println("NAMA\t\t : ".concat(nama));
        System.out.println("GOLONGAN\t : ".concat(Integer.toString(golongan)));
        System.out.println("JABATAN\t\t : ".concat(jabatan));
        
        System.out.println();

        System.out.printf("TUNJANGAN GOLONGAN\t\t : %.1f\n", manager.tunjaganGolongan(golongan));
        System.out.printf("TUNJANGAN JABATAN\t\t : %.1f\n", manager.tunjanganJabatan(jabatan));
        System.out.printf("TUNJANGAN KEHADIRAN\t\t : %.1f\n", manager.tunjanganKehadiran(kehadiran));
        System.out.println();
        System.out.printf("GAJI TOTAL\t\t : %.1f\n", manager.gajiTotal());
    }
    
}
