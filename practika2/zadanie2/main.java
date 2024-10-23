public class Main {
    public static void main(String[] args) {
        Car_2 bmw_e34 = new Car_2();
        Car_2 bmw_e39 = new Car_2("bmw-e39", "yes", "white", 2000);
        Car_2 bmw_e28 = new Car_2("bmw-e28", "dark-blue");

        To_String(bmw_e34);
        To_String(bmw_e39);
        To_String(bmw_e28);
        
        System.out.print('\n');

        bmw_e34.setColor("RED");
        bmw_e34.setLicense("No");
        bmw_e34.setModel("BMW_E34");
        bmw_e34.setYear(1996);

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
