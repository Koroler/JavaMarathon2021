package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        List<String> missingShoes = new ArrayList<>();
        File importFile = new File("E:\\Eldritch\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");
        try {
            Scanner scanner = new Scanner(importFile);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(";");
                if(Integer.parseInt(data[2]) == 0){
                    missingShoes.add(line);
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Импортируемый файл не найден");
        }


        File exportFile = new File("E:\\Eldritch\\JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt");
        try {
            PrintWriter pw = new PrintWriter(exportFile);
            for (String shoe : missingShoes){
                pw.println(shoe);
            }
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Экспортируемый файл не найден");
        }


    }
}
