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
public class method_fungsi_parameter {

    // Method fungsi dengan parameter, ngembaliin nilai (double)
    public double hitungLuasLingkaran(double jariJari) {
        double phi = 3.14;
        return phi * jariJari * jariJari; // Mengembalikan hasil luas
    }

    public static void main(String[] args) {
        method_fungsi_parameter fungsi = new method_fungsi_parameter();

        // Panggil method dengan parameter dan simpan hasilnya ke variabel
        double luas = fungsi.hitungLuasLingkaran(7.0); // contoh jari-jari 7
        System.out.println("Luas lingkaran dengan jari-jari 7 adalah: " + luas);
    }
}

