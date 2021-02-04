package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Ferrari");
        cars.add("Maserati");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Porsche");

        System.out.println(cars);

        cars.add(2, "Lamborghini");
        cars.remove(0);

        System.out.println(cars);

    }
}
