package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        int index = 0;
        int sumBiggest = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }
        for (int i = 0; i < array.length-2; i++) {
            int sum = array[i] + array[i + 1] + array[i + 2];
            if (sum >= sumBiggest){
                sumBiggest = sum;
                index = i;
            }
        }
        System.out.println("Сумма максимальной тройки: " + sumBiggest);
        System.out.println("Индекс первого элемента этой тройки: " + index);
    }
}
