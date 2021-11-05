package day04;

public class Passenger {
    private String name;
    private String ticketID;
    private int packages;

    public Passenger(String name, String ticketID, int packages) {
        this.name = name;
        this.ticketID = ticketID;
        this.packages = packages;
    }

    public int getPackages() {
        return packages;
    }
}
