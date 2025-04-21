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
public class array_dua_dimensi {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array 2 dimensi
        int[][] angka = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Isi array dua dimensi:");

        // Menampilkan isi array 2D
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j] + " ");
            }
            System.out.println(); // pindah baris
        }
    }
}
    

