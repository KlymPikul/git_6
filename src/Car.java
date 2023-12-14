public class Car extends Vehicle {
    private String model;

    // Конструктор
    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    // Переписанный метод toString() для вывода полной информации
    @Override
    public String toString() {
        return String.format("Brand: %s, Model: %s, Year: %d", getBrand(), model, getYear());
    }

    // Перегруженный метод displayInfo() для вывода информации о марке, модели и годе выпуска
    @Override
    public void displayInfo() {
        String info = String.format("Brand: %s, Model: %s, Year: %d", getBrand(), model, getYear());
        System.out.println(info);
    }
}
