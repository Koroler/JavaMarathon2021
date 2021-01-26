package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(11) + 90);
        Player player2 = new Player(random.nextInt(11) + 90);
        Player player3 = new Player(random.nextInt(11) + 90);
        Player player4 = new Player(random.nextInt(11) + 90);
        Player player5 = new Player(random.nextInt(11) + 90);
        Player player6 = new Player(random.nextInt(11) + 90);
        System.out.println(Player.getCountPLayers());
        Player.info();

        Player player7 = new Player(random.nextInt(11) + 90); // добавляем избыточного игрока.
        System.out.println(Player.getCountPLayers()); //проверяем предел числа игроков.
        Player.info();

        do{
            player1.run();
        } while (player1.getStamina() > 0);
        player1.run(); //проверяем вызов игрока с нулевой выносливостью.

        System.out.println(Player.getCountPLayers());
        Player.info(); //проверяем оставшееся число игроков.
    }
}
