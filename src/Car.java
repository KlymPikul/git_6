public class Car extends Vehicle {
    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car: Brand=" + getBrand() + ", Model=" + model + ", Year=" + getYear();
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Information: Brand=" + getBrand() + ", Model=" + model + ", Year=" + getYear());
    }
}
