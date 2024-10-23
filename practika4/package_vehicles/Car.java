package vehicles;

public class Car extends Vehicle {
    protected String vehicleType = "Car";
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        System.out.println("Нельзя изменить тип машины");
    }

    public void tooString() {
        System.out.println("Модель: " + Car.this.getModel());
        System.out.println("Лицензия: " + Car.this.getLicense());
        System.out.println("Цвет: " + Car.this.getColor());
        System.out.println("Год выпуска: " + Car.this.getYear());
        System.out.println("Имя владельца: " + Car.this.getOwnerName());
        System.out.println("Страховой номер: " + Car.this.getInsuranceNumber());
        System.out.println("Тип двигателя: " + Car.this.getEngineType());
        System.out.println("Тип машины: " + Car.this.getVehicleType() + "\n\n");
    }

    public Car() {}
    public Car(String model, String license, String color, String year, String ownerName,
               String insuranceNumber, String engineType, String vehicleType)
    {
        Car.this.setModel(model);
        Car.this.setLicense(license);
        Car.this.setColor(color);
        Car.this.setYear(year);
        Car.this.setOwnerName(ownerName);
        Car.this.setInsuranceNumber(insuranceNumber);
        Car.this.setEngineType(engineType);
        Car.this.setVehicleType(vehicleType);
    }
}

