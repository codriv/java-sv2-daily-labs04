package day04;

public class PlaneMain {
    public static void main(String[] args) {
        Plane plane = new Plane(5);
        Passenger passenger1 = new Passenger("Nagy Sándor", "FK452-876", 1);
        Passenger passenger2 = new Passenger("Kis Sándor", "HG876-987", 5);
        Passenger passenger3 = new Passenger("Közepes Sándor", "HJ452-876", 2);
        Passenger passenger4 = new Passenger("Nagy Piroska", "FK876-876", 0);
        Passenger passenger5 = new Passenger("Kis Juliska", "FK452-975", 3);
        Passenger passenger6 = new Passenger("Szép Ernő", "LK453-975", 1);

        System.out.println(plane.addPassenger(passenger1));
        System.out.println(plane.addPassenger(passenger2));
        System.out.println(plane.addPassenger(passenger3));
        System.out.println(plane.addPassenger(passenger4));
        System.out.println(plane.addPassenger(passenger5));
        System.out.println(plane.addPassenger(passenger6));

        System.out.println(plane.numberOfPackages());

    }

}
