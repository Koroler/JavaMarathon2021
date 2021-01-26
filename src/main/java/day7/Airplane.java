package day7;

import java.util.ArrayList;

public class Airplane {
    private String producer;
    private String model; //добавил модель чтобы было что сравнивать.
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public Airplane(String producer, String model, int year, double length, double weight){
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;

    }

    public void setProducer(String producer){this.producer = producer;}
    public void setModel(String model) { this.model = model; }
    public void setYear(int year){this.year = year;}
    public void setLength(double length){this.length = length;}
    public void setWeight(double weight){this.weight = weight;}
    public void setFuel(double fuel){this.fuel = fuel;}

    public double getFuel(){return fuel;}

    void info(){
        System.out.printf("Изготовитель %s, год выпуска: %d, длина: %.1f, вес: %.1f, количество топлива в баке: %.1f. %n",
                producer, year, length, weight, getFuel());
    }

    public void fillUp(double n){
        this.fuel += n;
    }

    public static void compareAirplanes(Airplane a, Airplane b){
        if(a.length > b.length){ System.out.printf("Модель %s производителя %s длиннее чем модель %s производителя %s. %n",a.model, a.producer,b.model, b.producer); }
        else if(a.length < b.length){ System.out.printf("Модель %s производителя %s длиннее чем модель %s производителя %s. %n",b.model, b.producer,a.model, a.producer); }
        else {System.out.printf("Длины самолетов моделей %s %s и %s %s равны.", a.producer, a.model, b.producer, b.model);}
    }

}
