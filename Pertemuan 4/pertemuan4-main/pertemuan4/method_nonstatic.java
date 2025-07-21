/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author ACER
 */
public class method_nonstatic {
    // Variabel non-static (milik objek)
    String nama;

    // Constructor (buat isi nama)
    public method_nonstatic(String nama) {
        this.nama = nama;
    }

    // Method non-static (butuh objek untuk dipanggil)
    void sapa() {
        System.out.println("Hai, aku " + nama);
    }

    public static void main(String[] args) {
        // Harus buat objek dulu
        method_nonstatic orang1 = new method_nonstatic("kymy");
        method_nonstatic orang2 = new method_nonstatic("Maniss");

        orang1.sapa();
        orang2.sapa();
    }
}

