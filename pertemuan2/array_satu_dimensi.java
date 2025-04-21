/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author ACER
 */
public class array_satu_dimensi {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array
        int[] angka = {10, 20, 30, 40, 50};

        System.out.println("Isi array satu dimensi:");

        // Menampilkan isi array
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks ke-" + i + ": " + angka[i]);
        }
    }
}
   

