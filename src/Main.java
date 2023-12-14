
public class Main {
    public static void main(String[] args) {

            Vehicle vehicle = new Vehicle("Toyota", 2022);
            vehicle.displayInfo();


            Car car = new Car("Honda", 2021, "Civic");
            System.out.println(car.toString());

            car.displayInfo();
        }
    }

