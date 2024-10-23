package vehicles;

public class Car {

    private String ownerName;
    public String getownerName() {
        return ownerName;
    }
    public void setownerName(String ownerName) {
        this.ownerName = ownerName;
    }

    private String insuranceNumber;
    public String getinsuranceNumber() {
        return insuranceNumber;
    }
    public void setinsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    protected String engineType;
    public String getengineType() {
        return engineType;
    }
    public void setengineType(String engineType) {
        this.engineType = engineType;
    }
}
