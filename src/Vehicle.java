public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.println("Vehicle Information: Brand=" + brand + ", Year=" + year);
    }

    public void displayInfo(String additionalInfo) {
        System.out.println("Vehicle Information: Brand=" + brand + ", Year=" + year + ", " + additionalInfo);
    }
}
