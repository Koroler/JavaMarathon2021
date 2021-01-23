package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[12][8];
        int index = 0;
        int sumBiggest = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
                sum += array[i][j];
            }
            if(sum >= sumBiggest){
                sumBiggest = sum;
                index = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой элементов: " + index);
        System.out.println("Сумма элементов этой строки: " + sumBiggest);
    }
}
