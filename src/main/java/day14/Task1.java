package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        File file = new File("testFile");
        printSumDigits(file);
    }

    static void printSumDigits(File file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] strNumbers = line.split(" ");

            if(strNumbers.length != 10){
            throw new IOException();}

            int sum = 0;
            for(String num : strNumbers){
                sum += Integer.parseInt(num);
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IOException e){
            System.out.println("Некорректный входной файл");
        }



    }
}
