package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Определите размер массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int biggerThanEight = 0;
        int equalsOne = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            System.out.print(array[i] + " ");
            if(array[i] % 2 == 0){
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            if(array[i] == 1){
                equalsOne++;
            }
            if(array[i] > 8){
                biggerThanEight++;
            }
            sum += array[i];
        }
        System.out.println();
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + biggerThanEight);
        System.out.println("Количество чисел равных 1: " + equalsOne);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количество нечетных чисел: " + oddNumbers);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
