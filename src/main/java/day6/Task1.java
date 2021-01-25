package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Black");
        car.setModel("Maserati");
        car.setYear(2001);
        Motorcycle motorcycle = new Motorcycle(1991, "Purple", "Yamaha");

        car.info();
        System.out.println(car.yearDifference(2021));
        motorcycle.info();
        System.out.println(motorcycle.yearDifference(1900));

    }
}
