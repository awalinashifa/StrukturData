/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author ACER
 */
// Class Mobil
class Mobil {
    String merk;
    String warna;
    int tahun;

    // Constructor
    Mobil(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Method untuk menampilkan info mobil
    void tampilkanInfo() {
        System.out.println("=== Info Mobil ===");
        System.out.println("Merk  : " + merk);
        System.out.println("Warna : " + warna);
        System.out.println("Tahun : " + tahun);
    }

    // Method tambahan biar manja dikit
    void nyalakanMesin() {
        System.out.println("Mesin " + merk + " dinyalakan... Brumm brumm!");
    }
}

// Class utama
public class PBO_mobil {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Toyota", "Hitam", 2022);

        mobilku.tampilkanInfo();
        mobilku.nyalakanMesin();
    }
}

    
