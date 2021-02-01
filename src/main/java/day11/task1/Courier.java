package day11.task1;

public class Courier implements Worker{
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private int delivered;

    public double getSalary() { return salary; }
    public boolean isPayed() { return isPayed; }
    private Warehouse getWarehouse() { return warehouse; }

    public Courier(Warehouse warehouse){
        this.warehouse = warehouse;
    }
    public void doWork(){
        this.salary += 100;
        this.warehouse.setCountDeliveredOrders(getWarehouse().getCountDeliveredOrders() + 1);
        this.delivered++;
    }

    public void bonus(){
        if(warehouse.getCountDeliveredOrders() >= 10000 && !this.isPayed){
            this.salary += (float) this.delivered / 10000 * 50000;//премия пропорциональна проценту выполненной работы
            this.isPayed = true;
        } else if(warehouse.getCountDeliveredOrders() <10000 &&!this.isPayed){
            System.out.println("Бонус пока не доступен.");
        } else if(this.isPayed){
            System.out.println("Бонус уже был выплачен.");
        }

    }

    public String toString() {
        String statement = "Зарплата курьера: " + salary + "\n";
        if (isPayed == true) {
            statement += "Бонус был выплачен. \n";
        } else {
            statement += "Бонус не был выплачен. \n";
        }
        return statement;
    }
}
