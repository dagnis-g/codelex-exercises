package io.codelex.oop.cars;

public class Main {
    public static void main(String[] args) {
        Manufacturer manu1 = new Manufacturer("manu1", 1899, "Germany");
        Manufacturer manu2 = new Manufacturer("manu2", 1916, "Germany");
        Manufacturer manu3 = new Manufacturer("manu3", 1990, "Germany");
        Manufacturer manu4 = new Manufacturer("manu4", 1994, "Germany");
        Manufacturer manu5 = new Manufacturer("manu5", 1989, "Germany");
        Manufacturer manu6 = new Manufacturer("manu6", 2001, "Germany");
        Manufacturer manu7 = new Manufacturer("manu7", 2010, "Germany");
        Manufacturer manu8 = new Manufacturer("manu8", 1997, "Germany");
        System.out.println(manu1.equals(manu2));

        Car audiA4 = new Car("Audi", "A4", 42000, 2022, Engine.S4);
        Car bmw320 = new Car("BMW", "320", 42000, 1998, Engine.V12);
        Car bmw318 = new Car("BMW", "318", 36000, 2022, Engine.S3);
        Car fordTransit = new Car("Ford", "Transit", 37000, 2022, Engine.S3);
        System.out.println(audiA4.equals(bmw320));

        bmw320.addToManufacturerList(manu1);
        bmw320.addToManufacturerList(manu2);
        bmw320.addToManufacturerList(manu3);
        bmw320.addToManufacturerList(manu8);

        audiA4.addToManufacturerList(manu4);
        audiA4.addToManufacturerList(manu5);

        fordTransit.addToManufacturerList(manu6);
        fordTransit.addToManufacturerList(manu7);

        ////////////////////////////////////////////////////////////////////////////

        CarService service = new CarService();

        service.addToCarList(audiA4);
        service.addToCarList(bmw320);
        service.addToCarList(bmw318);
        service.addToCarList(fordTransit);

        System.out.println("List: ");
        System.out.println(service.getCarList());

        service.removeFromCarList(bmw318);

        System.out.println("List: ");
        System.out.println(service.getCarList());

        System.out.println("By engine");
        System.out.println(service.getCarByEngine(Engine.V12));

        System.out.println("Before year");
        System.out.println(service.getBeforeYear(1999));

        System.out.println("Most expensive");
        System.out.println(service.getMostExpensive());

        System.out.println("Cheapest");
        System.out.println(service.getCheapest());

        System.out.println("Cars with at least 3 manufacturers");
        System.out.println(service.getByNumberOfManufacturers(3));

        System.out.println("Ascending :");
        System.out.println(service.sortByName("ascending"));
        System.out.println("Descending :");
        System.out.println(service.sortByName("descending"));

        System.out.println("If car is in the list");
        System.out.println(service.ifCarIsOnTheList(audiA4));

        System.out.println("list of cars manufactured by a specific manufacturer:");
        System.out.println(service.getCarByManufacturer(manu3));

        System.out.println(" list of cars manufactured by the manufacturer" +
                "\n with the year of establishment <,>, <=,> =, =,! = from the given");

        System.out.println(service.getByYearAndManufacturer(1990, "<"));
    }
}
