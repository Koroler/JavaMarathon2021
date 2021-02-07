package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        PrintWriter pw1 = new PrintWriter(file1);
        for (int i = 0; i < 1000; i++) {
            pw1.println(random.nextInt(101));
        }
        pw1.close();

        PrintWriter pw2 = new PrintWriter(file2);

        Scanner scanner = new Scanner(file1);
        int sum = 0;
        int i = 0;
        while (scanner.hasNextInt()){
            sum += scanner.nextInt();
            i++;
            if(i == 20){
                pw2.println((double) sum / i);
                sum = 0;
                i = 0;
            }
        }
        scanner.close();
        pw2.close();
        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        double sum = 0;
        while (scanner.hasNextDouble()){
            sum += scanner.nextDouble();
        }
        System.out.println((int)sum);
    }
}
