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
        String info = String.format("Brand: %s, Year: %d", brand, year);
        System.out.println(info);
    }
}
