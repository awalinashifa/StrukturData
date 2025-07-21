/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_2nd_Semester;

/**
 *
 * @author ACER
 */
public class menggabungkan_duaArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Buat array baru dengan panjang gabungan
        int[] gabungan = new int[array1.length + array2.length];

        // Salin elemen dari array1 ke array gabungan
        for (int i = 0; i < array1.length; i++) {
            gabungan[i] = array1[i];
        }

        // Salin elemen dari array2 ke array gabungan
        for (int i = 0; i < array2.length; i++) {
            gabungan[array1.length + i] = array2[i];
        }

        // Cetak hasil array gabungan
        System.out.print("Array hasil gabungan: ");
        for (int i = 0; i < gabungan.length; i++) {
            System.out.print(gabungan[i] + " ");
        }
    }
}

