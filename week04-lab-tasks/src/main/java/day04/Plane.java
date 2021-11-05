package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity;
    private List<Passenger> passengerList = new ArrayList<>();
    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengerList.size() < maxCapacity) {
            passengerList.add(passenger);
        } else {
            return false;
        }
        return true;
    }

    public int numberOfPackages() {
        int sumOfPackages = 0;
        for (Passenger passenger: passengerList) {
            sumOfPackages += passenger.getPackages();
        }
        return sumOfPackages;
    }
}
