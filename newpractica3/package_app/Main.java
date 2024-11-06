package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "123ABC", "Red", 2019, "Aleksandr.A", "INS123456", "Gasoline");
        System.out.println(car1);
        
        System.out.println("Accessing public field: " + car1.getOwnerName());
        car1.setOwnerName("Nikita.A");
        System.out.println("Updated Owner: " + car1.getOwnerName());
        
        System.out.println("\n---\n");

        ElectricCar electricCar1 = new ElectricCar("Tesla", "456DEF", "Blue", 2021, "Bob Johnson", "INS654321", 75);
        System.out.println(electricCar1);

        System.out.println("Engine Type of Electric Car: " + electricCar1.getEngineType());
    }
}
