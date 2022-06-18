public class Passenger {

    private String name;
    private int numberOfBags;
    private Flight flight;


    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public void setFlight(Flight flight){
        this.flight = flight;


    }

    public Location getPassengerFlightDestination() {
        return flight.getDestination();
    }
}
