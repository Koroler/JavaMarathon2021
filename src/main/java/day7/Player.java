package day7;

import java.util.spi.AbstractResourceBundleProvider;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPLayers = 0;

    public void setStamina(int stamina) { this.stamina = stamina; }
    public static void setCountPLayers(int countPLayers) { Player.countPLayers = countPLayers; }

    public int getStamina() { return stamina; }
    public static int getCountPLayers() { return countPLayers; }

    public Player(int stamina){
        this.stamina = stamina;
        if(countPLayers < 6){ countPLayers++;}
    }

    void run(){
        if (this.stamina > 1 && this.stamina <= 100) {
            this.stamina --;
        } else if(stamina == 1){
            this.stamina--;
            countPLayers--;
            System.out.println("Игрок устал и уходит на отдых");
        } else if(stamina == MIN_STAMINA){
            System.out.println("Игрок отдыхает и сейчас недоступен");
        } else {
            System.out.println("ОШИБКА КОДА, число приняло значение: " + this.stamina);
        }
    }
    static void info(){
        switch (countPLayers){
            case 6:
                System.out.println("На поле нет свободных мест."); break;
            case 5:
                System.out.println("Команды неполные. На поле ещё есть 1 место."); break;
            case 4:
            case 3:
            case 2:
                System.out.printf("Команды неполные. На поле ещё есть %d места.%n", 6-countPLayers); break;
            case 1:
                System.out.println("Команды неполные. На поле ещё есть 5 мест."); break;
            case 0:
                System.out.println("На поле никого нет, только перекатиполе и свист сверчков."); break;
            default:
                System.out.println("Э! Откуда вы все взялись!? А ну марш отсуда, поле не резиновое!"); break;
        }

    }

}
