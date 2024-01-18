package Latihan3;

public class Weapon {
    String weapon;
    Double attack;

    Weapon (String weapon, Double attack) {
        this.weapon = weapon;
        this.attack = attack;
    }
    void show() {
        System.out.println("Weapon :" + this.weapon);
        System.out.println("Attack :" + this.attack);
    }
}
