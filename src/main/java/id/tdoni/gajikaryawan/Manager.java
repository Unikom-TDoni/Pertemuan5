/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.gajikaryawan;

/**
 *
 * @author ACER
 */
public class Manager extends Karyawan {

    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;
    
    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir) {
        this.tunjanganKehadiran = kehadiran * 10000;
        return this.tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan) {
        if(jabatan.equals("Manager"))
            this.tunjanganJabatan = 2000000;
        return this.tunjanganJabatan;
    }
    
    public float tunjaganGolongan(int golongan) {
        switch(golongan) {
            case 1:
                this.tunjanganGolongan = 500000;
                return this.tunjanganGolongan;
            case 2:
                this.tunjanganGolongan = 1000000;
                return this.tunjanganGolongan;
            case 3:
                this.tunjanganGolongan = 1500000;
                return this.tunjanganGolongan;
            default:
                return 0;
        }   
    }
    
    public float gajiTotal() {
        return tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
    }
    
}
