package day11.task1;

public class Picker implements Worker{
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private int picked;

    public double getSalary() { return salary; }
    public boolean isPayed() { return isPayed; }
    private Warehouse getWarehouse() { return warehouse; }

    public Picker(Warehouse warehouse){
        this.warehouse = warehouse;
    }
    public void doWork(){
        this.salary += 80;
        this.warehouse.setCountPickedOrders(getWarehouse().getCountPickedOrders() + 1);
        this.picked++;
    }

    public void bonus(){
        if(warehouse.getCountPickedOrders() >= 10000 && !this.isPayed){
            this.salary += (float) this.picked / 10000 * 70000;//премия пропорциональна проценту выполненной работы
            this.isPayed = true;
        } else if(warehouse.getCountPickedOrders() <10000 &&!this.isPayed){
            System.out.println("Бонус пока не доступен.");
        } else if(this.isPayed){
            System.out.println("Бонус уже был выплачен.");
        }

    }

    public String toString() {
        String statement = "Зарплата сборщика: " + salary + "\n";
        if (isPayed == true) {
            statement += "Бонус был выплачен. \n";
        } else {
            statement += "Бонус не был выплачен. \n";
        }
        return statement;
    }
}
