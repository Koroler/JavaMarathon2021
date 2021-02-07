package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("testFile2.txt"); //сделал файл отличный от файла задания 14.1, чтобы могла получиться бесконечная дробь
        printResult(file);

    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);

            int sum = 0; int i = 0;
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                i++;
            }

            double average = (double) sum / i;
            System.out.printf("%f --> %.3f", average, average);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

}



