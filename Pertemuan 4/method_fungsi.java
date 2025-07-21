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
public class method_fungsi {

    // Fungsi untuk menghitung luas persegi
    public int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) {
        method_fungsi contoh = new method_fungsi();
        
        int sisi = 5;
        int hasil = contoh.hitungLuasPersegi(sisi);
        
        System.out.println("Luas persegi dengan sisi " + sisi + " = " + hasil);
    }
}
    
