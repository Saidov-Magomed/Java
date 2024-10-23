package vehicles;

public class ElectricCar extends Car{
    private String batteryCapacity;
    public String getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    protected String vehicleType = "Electric Car";
    public String getVehicleType() {
        return vehicleType;
    }

    protected String engineType = "Electric";
    public String getEngineType() {
        return engineType;
    }

    public void tooString() {
        System.out.println("Модель: " + ElectricCar.this.getModel());
        System.out.println("Лицензия: " + ElectricCar.this.getLicense());
        System.out.println("Цвет: " + ElectricCar.this.getColor());
        System.out.println("Год выпуска: " + ElectricCar.this.getYear());
        System.out.println("Имя владельца: " + ElectricCar.this.getOwnerName());
        System.out.println("Страховой номер: " + ElectricCar.this.getInsuranceNumber());
        System.out.println("Тип двигателя: " + ElectricCar.this.getEngineType());
        System.out.println("Тип машины: " + ElectricCar.this.getVehicleType());
        System.out.println("Емкость аккумулятора: " + getBatteryCapacity() + "\n\n");
    }
    public ElectricCar(String model, String license, String color, String year, String ownerName,
            String insuranceNumber, String engineType, String vehicleType, String batteryCapacity)
    {
        ElectricCar.this.setModel(model);
        ElectricCar.this.setLicense(license);
        ElectricCar.this.setColor(color);
        ElectricCar.this.setYear(year);
        ElectricCar.this.setOwnerName(ownerName);
        ElectricCar.this.setInsuranceNumber(insuranceNumber);
        ElectricCar.this.setEngineType(engineType);
        ElectricCar.this.setVehicleType(vehicleType);
        ElectricCar.this.setBatteryCapacity(batteryCapacity);
    }
}

