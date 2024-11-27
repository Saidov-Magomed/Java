package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("BMW", "ABC123", "Red", 1994, "Magomed", "INS123");
        ElectricCar electricCar = new ElectricCar("Tesla", "DEF456", "Black", 2021, "Artur", "INS456", 75.0);

        car.setYear(1996);
        car.setOwnerName("Makar");
        electricCar.setOwnerName("Nikolay");
        electricCar.setBatteryCapacity(80.0);


        car.setInsuranceNumber("INS789");
        electricCar.setInsuranceNumber("INS000"); 

        double batteryCapacity = electricCar.getBatteryCapacity();
        System.out.println("Battery Capacity of Electric Car: " + batteryCapacity + " kWh");

        
        System.out.println("\nCar Info:");
        System.out.println(car.toString());

        System.out.println("\nElectric Car Info:");
        System.out.println(electricCar.toString());
    }
}

