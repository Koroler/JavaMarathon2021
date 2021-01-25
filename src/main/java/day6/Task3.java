package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher markIgnatievich = new Teacher("Марк Игнатьевич", "Мемология");
        Student johnDoe = new Student("Джон Доу");
        markIgnatievich.evaluate(johnDoe);

    }
}
