package vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private int year;
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public Vehicle(model, license, color, year, ownerName, insuranceNumber)
    {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getLicense() { return license; }
    public void setLicense(String license) { this.license = license; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    public String getEngineType() { return engineType; }


    public String toString()
    {
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

    public abstract String vehicleType();
}

