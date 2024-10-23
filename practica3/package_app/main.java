package app;

import vehicles.ElectricCar;
import vehicles.Car;

public class Main {
    public static void main(String[] args) {
        System.out.print("Class Car" + '\n');
        Car car = new Car();
        car.setengineType("ДВС");
        car.setinsuranceNumber("00000001");
        car.setownerName("Магомед");
        System.out.print("Тип двигателя: " + car.getengineType() + '\n');
        System.out.print("Страховой номер: " + car.getinsuranceNumber() + '\n');
        System.out.print("Имя владельца: " + car.getownerName() + '\n' + '\n');

        System.out.print("Class ElectricCar" + '\n');
        ElectricCar electricCar = new ElectricCar();
        electricCar.setengineType("ДВС");
        electricCar.setinsuranceNumber("00000002");
        electricCar.setownerName("Пётр");
        electricCar.setbatteryCapacity("82 kW/h");
        System.out.print("Тип двигателя: " + electricCar.getengineType() + '\n');
        System.out.print("Страховой номер: " + electricCar.getinsuranceNumber() + '\n');
        System.out.print("Имя владельца: " + electricCar.getownerName() + '\n');
        System.out.print("Емкость аккумулятора: " + electricCar.getbatteryCapacity() + '\n');
    }
}
