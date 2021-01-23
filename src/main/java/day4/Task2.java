package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int numZero = 0;
        int sumZero = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }

        int max = array[0];
        int min = array[0];

        for (int num : array){
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
            if (num % 10 == 0){
                numZero++;
                sumZero += num;
            }
        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + numZero);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sumZero);
    }
}
