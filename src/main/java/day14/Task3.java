package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        List<Human> listOfHumans = parseFileToStringList(file);
        System.out.println(listOfHumans);

    }

    public static List<Human> parseFileToStringList(File file) {
        Scanner scanner = null;
        List<Human> humans = new ArrayList<>();
        try {
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(" ");
                if (Integer.parseInt(data[1]) < 0) {
                    throw new IOException();
                }
                Human human = new Human(data[0], Integer.parseInt(data[1]));
                humans.add(human);

            }
            return humans;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;

    }
}
