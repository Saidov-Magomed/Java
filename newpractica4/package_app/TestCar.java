package app;

import vehicles.*;

public class TestCar {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "123ABC", "Red", 1996, "Saidov M", "INS123456");
        System.out.println(car1); 
        
        ElectricCar electricCar1 = new ElectricCar("Tesla", "456DEF", "Blue", 2021, "Roy Jones", "INS654321", 75);
        System.out.println(electricCar1);

        // Полиморфизм
        Vehicle vehicle1 = car1; 
        Vehicle vehicle2 = electricCar1;
        
        vehicle1.setColor("White");
        vehicle2.setOwnerName("John Jones");
        
        System.out.println("\nUpdated Car:\n" + vehicle1);
        System.out.println("Updated Electric Car:\n" + vehicle2);
    }
}
