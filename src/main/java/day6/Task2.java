package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2002, 63.7, 297.5);
        airplane.info();
        airplane.setYear(2005);
        airplane.setLength(69.3);
        airplane.fillUp(350.5);
        airplane.fillUp(497.2);
        airplane.info();

    }
}
