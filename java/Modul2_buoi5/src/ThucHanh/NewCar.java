package ThucHanh;

public class NewCar {
    public static void main(String[] args) {
        Car car1 = new Car("Electric Car1", "Elictric");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("petro Car2", "Petro");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("petro Car3", "Petro");
        System.out.println(Car.numberOfCars);
    }
}
