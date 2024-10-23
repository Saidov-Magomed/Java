package vehicles;

public class ElectricCar extends Car {
    private String batteryCapacity;
    public String getbatteryCapacity(){
        return batteryCapacity;
    }
    public void setbatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    protected String engineType = "electric";
    public String getengineType(){
        return engineType;
    }
    public void setengineType(String batteryCapacity) {
        System.out.println("Нельзя изменить тип двигателя");
    }

}
