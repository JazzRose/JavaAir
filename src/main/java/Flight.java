import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private Location destination;
    private Location departure;
    private String departureTime;
    private FlightManager flightManager;


    public Flight(Pilot pilot,Plane plane, String flightNumber, Location destination, Location departure, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public int getPlaneCapacity() {
        return this.plane.getPlaneCapacity();
    }

    public int getPlaneWeight() {
        return this.plane.getPlaneWeight();
    }

    public String getDestinationCountry() {
        return this.destination.getCountry();
    }

    public String getDestinationCity() {
        return this.destination.getCity();
    }

    public String getDepartureCountry() {
        return this.departure.getCountry();
    }

    public String getDepartureCity(){
        return this.departure.getCity();
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public void bookInPassenger(Passenger passenger) {
        if (getRemainingSeatCount() > 0)
        passengers.add(passenger);
    }

    public int getRemainingSeatCount() {
        return plane.getPlaneCapacity() - passengers.size();
    }

    public double flightBaggageWeightPerPerson() {
        return flightManager.baggageWeightPerPassenger();
    }
}


