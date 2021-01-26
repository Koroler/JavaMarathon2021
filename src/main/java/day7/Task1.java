package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane boeing1 = new Airplane("Boeing", "777-200ER ",2002, 63.7, 155.5);
        Airplane airbus = new Airplane("Airbus", "A320-211", 1990, 37.6, 42.1);
        Airplane boeing2 = new Airplane("Boeing", "787-9 ",2012, 63.7, 126.5);

        Airplane.compareAirplanes(boeing1, airbus);
        Airplane.compareAirplanes(airbus, boeing1);
        Airplane.compareAirplanes(boeing1, boeing2);

    }
}