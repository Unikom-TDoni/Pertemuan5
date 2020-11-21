/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.siapakamu;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan siapa kamu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var dosen = buatDosen();
        var mahasiswa = buatMahasiswa();
        
        tampilkanDataDosen(dosen);
        System.out.println();
        tampilkanDataMahasiswa(mahasiswa);
    }
    
    private static Dosen buatDosen() {
        var dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        return dosen;
    }
    
    private static Mahasiswa buatMahasiswa() {
        var mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10110269");
        mahasiswa.setNama("Nindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO2");
        return mahasiswa;
    }
    
    private static void tampilkanDataDosen(Dosen dosen) {
        System.out.println("NIP DOSEN : ".concat(dosen.getNip()));
        dosen.siapaKamu();
        dosen.mengajarApa();
    }
    
    private static void tampilkanDataMahasiswa(Mahasiswa mahasiswa) {
        System.out.println("NIM MAHASISWA : ".concat(mahasiswa.getNim()));
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}
