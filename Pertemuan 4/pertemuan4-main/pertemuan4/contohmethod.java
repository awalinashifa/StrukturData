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
public class contohmethod {
    
    public static void main(String[] args) {
        
        contohmethod contoh = new contohmethod();
        contoh.luasLingkaranProsedur ();
        contoh.luasLingkaranFungsi ();  
        
        }

    // cara pertama membuat method
    // Method Prosedur
    // Ditandai dengan void

    public void luasLingkaranProsedur(){
       double jari2 = 10;
       double phi = 3.14;
       double luas = phi * jari2* jari2;
       System.out.println("luas lingkaran pakai method Prosedur = " + luas);
    }

    // cara kedua
    // membuat method dengan fungsi 
    // ditandai dengan nilai balik "return" dan diawali dengan tipe data

    public double luasLingkaranFungsi(){
        double jari2 = 15;
        double phi = (float) 3.14;
        double luas = phi*jari2*jari2;
        System.out.println("luas lingkaran pakai method Fungsi = " + luas);
        return luas;

    }

}

