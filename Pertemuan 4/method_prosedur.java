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
public class method_prosedur {

    // Method prosedur tanpa parameter
    public void hitungLuas() {
        double jariJari = 7.0;
        double phi = 3.14;
        double luas = phi * jariJari * jariJari;

        // Bulatin hasilnya jadi angka bulat
        int hasil = (int) luas; // Casting ke int
        System.out.println("Luas lingkaran dengan jari-jari 7 adalah: " + hasil);
    }

    public static void main(String[] args) {
        method_prosedur lingkaran = new method_prosedur();
        lingkaran.hitungLuas();
    }
}



