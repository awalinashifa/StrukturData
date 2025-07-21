/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author ACER
 */
// Class Player
class Player {
    String nama;
    int level;
    int health;

    // Constructor
    Player(String nama, int level, int health) {
        this.nama = nama;
        this.level = level;
        this.health = health;
    }

    // Method buat nampilin info player
    void tampilkanInfo() {
        System.out.println("=== Info Player ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Level  : " + level);
        System.out.println("Health : " + health);
    }

    // Method buat player nyerang
    void serang() {
        System.out.println(nama + " menyerang musuh! 💥");
    }
}

// Class utama
public class master_PBO_player {
    public static void main(String[] args) {
        Player player1 = new Player("Arkana", 5, 100);

        player1.tampilkanInfo();
        player1.serang();
    }
}

    

