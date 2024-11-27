package vehicles;

public class ElectricCar extends Car implements ElectricVehicle
{
    private double batteryCapacity;

    public ElectricCar(String model, String license, String color, int year, String ownerName, String insuranceNumber, double batteryCapacity)
    {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        this.engineType = "Electric"; 
    }


    public double getBatteryCapacity()
    {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity)
    {
        this.batteryCapacity = batteryCapacity;
    }


    public String vehicleType()
    {
        return "Electric Car";
    }


    public String toString()
    {
        return super.toString() + "\n" +
               "Battery Capacity: " + batteryCapacity + " kWh";
    }
}
