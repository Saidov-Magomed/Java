public class Main {
    public static void main(String[] args) {
        Car_2 bmw_e34 = new Car_2();
        Car_2 bmw_e39 = new Car_2("bmw-e39", "yes", "white", 2000);
        Car_2 bmw_e28 = new Car_2("bmw-e28", "dark-blue");

        To_String(bmw_e34);

        System.out.print('\n');

        uazic_0.setColor("red");
        uazic_0.setLicense("no");
        uazic_0.setModel("bmw_e34");
        uazic_0.setYear(1996);

        System.out.print("Model: " + bmw_e34.getModel());
        System.out.print("\nLicense: " + bmw_e34.getLicense());
        System.out.print("\nColor: " + bmw_e34.getColor());
        System.out.print("\nYear: " + bmw_e34.getYear());
        System.out.print("\nAge of the car: " + bmw_e34.carAge());
    }
    public static void To_String (Car_2 car) {
        System.out.print("Model: " + car.model + "\nLicense: " + car.license + "\nColor: " + car.color + "\nYear: " + car.year + '\n');
    }
}
