package day6;

class Car {
    private int year;
    private String color;
    private String model;

    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
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
        System.out.println("This is a car");
    }

    int yearDifference(int inputYear){
        return Math.abs(inputYear - this.year);
    }
}
