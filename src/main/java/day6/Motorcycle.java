package day6;


class Motorcycle {
    private int year;
    private String color;
    private String model;

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
    void info(){
        System.out.println("This is a motorcycle");
    }

    int yearDifference(int inputYear){
        return Math.abs(inputYear - this.year);
    }
}
