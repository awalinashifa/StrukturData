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
public class hitung_kemunculan_elemen {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 2, 1};
        int n = array.length;
        boolean[] sudahDihitung = new boolean[n];

        System.out.println("Jumlah kemunculan setiap elemen:");

        for (int i = 0; i < n; i++) {
            if (sudahDihitung[i]) {
                continue; // lewati elemen yang sudah dihitung
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    count++;
                    sudahDihitung[j] = true; // tandai sebagai sudah dihitung
                }
            }

            System.out.println("Angka " + array[i] + " muncul sebanyak " + count + " kali");
        }
    }
}
