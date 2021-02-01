package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.PhysAttack(paladin);
        System.out.println(paladin.toString());

        paladin.PhysAttack(magician);
        System.out.println(magician.toString());

        shaman.healTeammate(magician);
        System.out.println(magician.toString());

        magician.magicalAttack(paladin);
        System.out.println(paladin.toString());

        shaman.PhysAttack(warrior);
        System.out.println(warrior.toString());

        paladin.healHimself();
        System.out.println(paladin.toString());

        System.out.println();

        for (int i = 0; i < 5; i++) {
            warrior.PhysAttack(magician);
            System.out.println(magician.toString());

        }

    }
}
