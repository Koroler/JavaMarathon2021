package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа (второе больше первого): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a >= b) {
            System.out.println("Некорректный ввод");
        }
        int i = a;
        while(i < b){
            if(i % 5 == 0){
                if(i % 10 != 0){
                    System.out.print(i + "; ");

                }
            }
            i++;
        }
    }
}
