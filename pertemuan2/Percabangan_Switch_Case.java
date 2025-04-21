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
import java.util.Scanner;

public class Percabangan_Switch_Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka hari (1-7): ");
        int hari = input.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Hari ini adalah Minggu");
                break;
            case 2:
                System.out.println("Hari ini adalah Senin");
                break;
            case 3:
                System.out.println("Hari ini adalah Selasa");
                break;
            case 4:
                System.out.println("Hari ini adalah Rabu");
                break;
            case 5:
                System.out.println("Hari ini adalah Kamis");
                break;
            case 6:
                System.out.println("Hari ini adalah Jumat");
                break;
            case 7:
                System.out.println("Hari ini adalah Sabtu");
                break;
            default:
                System.out.println("Angka tidak valid. Masukkan angka 1 sampai 7.");
        }

        input.close();
    }
}
