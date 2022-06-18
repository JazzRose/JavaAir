public class Passenger {

    private String name;
    private int numberOfBags;
    private Flight flight;
    int seatNumber;


    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = null;
        this.seatNumber = 0;
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

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber() {
        int capacity = flight.getPlaneCapacity();
        double seatAllocation = Math.random()*(capacity + 1);
        this.seatNumber = (int)seatAllocation;
        for (Passenger passenger: flight.getPassengers())
            if (seatNumber == passenger.seatNumber)
                setSeatNumber();
    }
}
