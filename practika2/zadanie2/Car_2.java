public class Car_2 {
    String model;
    String license;
    String color;
    int year;

    public Car_2(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    };
    public Car_2(String model, String color) {
        this.model = model;
        this.color = color;
    };
    public Car_2() {};

    public String getModel() {
        return model;
    }
    public String getLicense() {
        return license;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int carAge() {
        return (int) year - 2024;
    }
}
