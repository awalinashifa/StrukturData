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
public class method_static {
    // Variabel static (milik class, bukan objek)
    static String pesan = "Halo dari static!";

    // Method static (bisa dipanggil tanpa bikin objek)
    static void tampilkanPesan() {
        System.out.println(pesan);
    }

    public static void main(String[] args) {
        // Panggil langsung, tanpa bikin objek
        method_static.tampilkanPesan();
    }
}

