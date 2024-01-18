package Latihan3;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Hetta", 18.0);
        Player player2 = new Player("Sekar", 20.0);
        Weapon weapon1 = new Weapon("M416", 98.0);
        Weapon weapon2 = new Weapon("Kar98", 96.0);
        Armor armor1 = new Armor("Vest", 100.0);
        Armor armor2 = new Armor("Helm", 100.0);

        player1.show();
        player2.show();
        weapon1.show();
        weapon2.show();
        armor1.show();
        armor2.show();
    }
}
