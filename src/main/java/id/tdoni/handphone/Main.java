/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.handphone;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan data handphone
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var android = buatAndroid();
        var blackBerry = buatBlackBerry();
        var windowsPhone = buatWindowsPhone();
        
        tampilkanDataProduct(android);
        tampilkanAndroidKey(android.getKeyStore());
        System.out.println();
        
        tampilkanDataProduct(blackBerry);
        tampilkanPinBB(blackBerry.getPinBB());
        System.out.println();

        tampilkanDataProduct(windowsPhone);
        tampilkanWpKeyStroe(windowsPhone.getWpKeyStore());
    }
    
    private static Android buatAndroid() {
        var android = new Android("Samsung", "Android", "Grand", 3000000);
        android.setKeyStore("234ibfd3840fo");
        return android;
    }
    
    private static BlackBerry buatBlackBerry() {
        var blackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackBerry.setPinBB("BHS249");
        return blackBerry;
    }
    
    private static WindowsPhone buatWindowsPhone() {
        var windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windowsPhone.setWpKeyStore("UUUQIJWORJ");
        return windowsPhone;
    }
    
    private static void tampilkanDataProduct(Handphone handphone) {
        handphone.displayProduct();
    }
    
    private static void tampilkanAndroidKey(String androidKey) {
        System.out.println("Android Key Store : ".concat(androidKey));
    }
    
    private static void tampilkanPinBB(String pinBB) {
        System.out.println("PIN : ".concat(pinBB));
    }
    
    private static void tampilkanWpKeyStroe(String wpKey) {
        System.out.println("Wp Key Store : ".concat(wpKey));
    }
}
