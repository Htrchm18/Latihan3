package Latihan3;

public class Player {
    String player;
    Double health;

    Player (String player, Double health) {
        this.player = player;
        this.health = health;
    }
    void show() {
        System.out.println("Nama :" + this.player);
        System.out.println("Health :" + this.health);
    }
}
