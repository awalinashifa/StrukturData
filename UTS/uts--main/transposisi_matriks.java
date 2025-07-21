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
public class transposisi_matriks {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transpos = new int[3][3];

        // Proses transposisi
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpos[j][i] = matriks[i][j];
            }
        }

        // Cetak matriks asli
        System.out.println("Matriks Asli:");
        cetakMatriks(matriks);

        // Cetak hasil transposisi
        System.out.println("Matriks Transpos:");
        cetakMatriks(transpos);
    }

    public static void cetakMatriks(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}

