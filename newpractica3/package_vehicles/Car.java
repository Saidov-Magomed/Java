package vehicles;

public class Car {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName; 
    private String insuranceNumber; 
    protected String engineType; 

    public Car(String model, String license, String color, int year, String ownerName, String insuranceNumber, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public Car() {
        this.model = "BMW";
        this.license = "123ABD";
        this.color = "Black";
        this.year = 2023;
        this.ownerName = "Aleksandr.A";
        this.insuranceNumber = "123456";
        this.engineType = "Gasoline";
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        String str;
        str = "Model: " + model+ "\n";
        str += "License: " + license+ "\n";
        str += "Color: " + color+ "\n";
        str += "Year: " + year+ "\n";
        str += "Owner: " + ownerName+ "\n";
        str += "Insurance Number: " + insuranceNumber+ "\n";
        str += "Engine Type: " + engineType+ "\n";

        return str;
    }
}
