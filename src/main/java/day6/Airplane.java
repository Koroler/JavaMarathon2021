package day6;

import java.sql.SQLOutput;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public Airplane(String producer, int year, double length, double weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;

    }

    public void setProducer(String producer){this.producer = producer;}
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

}
