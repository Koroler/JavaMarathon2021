package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число этажей: ");
        int floorCount = scanner.nextInt();
        if(floorCount >= 9){
            System.out.println("Многоэтажный дом");
        } else if(floorCount >= 5){
            System.out.println("Среднеэтажный дом");
        } else if(floorCount >= 1){
            System.out.println("Малоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }

    }
}
