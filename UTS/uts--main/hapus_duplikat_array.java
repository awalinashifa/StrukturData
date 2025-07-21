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
public class hapus_duplikat_array {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int n = array.length;

        int[] hasil = new int[n]; // array untuk menyimpan hasil tanpa duplikat
        int ukuranHasil = 0;

        for (int i = 0; i < n; i++) {
            boolean duplikat = false;
            for (int j = 0; j < ukuranHasil; j++) {
                if (array[i] == hasil[j]) {
                    duplikat = true;
                    break;
                }
            }
            if (!duplikat) {
                hasil[ukuranHasil] = array[i];
                ukuranHasil++;
            }
        }

        // Tampilkan hasil
        System.out.print("Array tanpa duplikat: [");
        for (int i = 0; i < ukuranHasil; i++) {
            System.out.print(hasil[i]);
            if (i < ukuranHasil - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

