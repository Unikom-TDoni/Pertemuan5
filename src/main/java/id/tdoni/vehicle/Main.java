/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.vehicle;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan data vehicle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var bicycle = buatBicycle();
        tampilkanDataVehicle(bicycle);
        tampilkanJumlahGearBicycle(bicycle.getGearCount());
        
        System.out.println();  
        
        var skateBoard = buatSkateBoard();
        tampilkanDataVehicle(skateBoard);
        tampilkanPanjangSkateBoard(skateBoard.getBoardLength());
    }
    
    private static Bicycle buatBicycle() {
        var bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setGearCount(23);
        return bicycle;
    }
    
    private static Skateboard buatSkateBoard() {
        var skateBoard = new Skateboard();
        skateBoard.setBrand("Ally Skate");
        skateBoard.setModel("Rocket");
        skateBoard.setBoardLength(54.5d);
        return skateBoard;
    }
    
    private static void tampilkanDataVehicle(Vehicle vehicle) {
        System.out.println("Brand : ".concat(vehicle.getBrand()));
        System.out.println("Model : ".concat(vehicle.getModel()));
    }
    
    private static void tampilkanPanjangSkateBoard(double panjangSkateBoard) {
        System.out.printf("Panjang Skateboard: %.1f\n", panjangSkateBoard);
    }
    
    private static void tampilkanJumlahGearBicycle(int jumlahGear) {
        System.out.printf("Panjang Skateboard: %d\n", jumlahGear);
    }
}
