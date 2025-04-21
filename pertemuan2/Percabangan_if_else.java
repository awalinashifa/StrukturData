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
public class Percabangan_if_else {
 
    public static void main(String[] args) {
        // Deklarasi variabel angka
        int angka = 22;

        // Percabangan if-else untuk mengecek apakah angka genap atau ganjil
        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah bilangan genap.");
        } else {
            System.out.println("Angka " + angka + " adalah bilangan ganjil.");
        }
    }
}

