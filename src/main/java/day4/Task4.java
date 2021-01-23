package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        int index = 0;
        int sumBiggest = 0;
        int quantity = 3; //сколько элементов нужно просуммировать

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= array.length - quantity; i++) {
            int sum = 0;
            for (int j = i; j < i + quantity; j++) {
                sum += array[j];
            }
            if (sum >= sumBiggest){
                sumBiggest = sum;
                index = i;
            }
        }
        System.out.printf("Максимальная сумма из %d последовательных элементов: %d %n", quantity, sumBiggest);
        System.out.println("Индекс первого элемента из суммы: " + index);
    }
}
