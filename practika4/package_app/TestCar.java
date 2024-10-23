package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("Class Car");
        Car car = new Car("BMW", "A111AA05", "Red", "1996", "Magomed", "00000011", "DVC", "Sedan");
        System.out.println(car.toString()+ '\n');
        car.tooString();

        System.out.println("Class ElectricCar");
        ElectricCar electricCar = new ElectricCar("Tesla S", "M111MM01", "White", "2022",
                "Petr", "00000022", "DVS", "Sedan", "65 kW/h");
        System.out.println(electricCar.toString() + '\n');
        electricCar.tooString();
    }
}

