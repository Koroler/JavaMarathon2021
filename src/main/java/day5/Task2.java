package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle(1991, "black", "Yamaha");
        System.out.println(motorcycle.getYear());
        System.out.println(motorcycle.getColor());
        System.out.println(motorcycle.getModel());
    }
}

class Motorcycle{
    int year;
    String color;
    String model;

    public Motorcycle(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
}
