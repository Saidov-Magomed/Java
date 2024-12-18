package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "123ABC", "Red", 1996, "Saidov. M", "INS123456", "Gasoline");
        System.out.println(car1);
        
        System.out.println("Accessing public field: " + car1.getOwnerName());
        car1.setOwnerName("Bolyan. M");
        System.out.println("Updated Owner: " + car1.getOwnerName());
        
        System.out.println("\n---\n");

        ElectricCar electricCar1 = new ElectricCar("Tesla", "456DEF", "Blue", 2021, "Roy Jones", "INS654321", 75);
        System.out.println(electricCar1);

        System.out.println("Engine Type of Electric Car: " + electricCar1.getEngineType());
    }
}
