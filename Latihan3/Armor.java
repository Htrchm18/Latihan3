package Latihan3;

public class Armor {
    String armor;
    Double defense;

    Armor (String armor, Double defense) {
        this.armor = armor;
        this.defense = defense;
    }
    void show() {
        System.out.println("Armoe :" + this.armor);
        System.out.println("Defense :" + this.defense);
    }
}
