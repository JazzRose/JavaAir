import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private Flight flight;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    protected Plane plane;
    private String flightNumber;
    private Location destination;
    private Location departure;
    private String departureTime;



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

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Location getDestination() {
        return destination;
    }

    public Location getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
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

    public void bookInPassenger(Passenger passenger, Flight flight) {
        if (getRemainingSeatCount() > 0)
        passengers.add(passenger);
        passenger.setFlight(flight);
    }

    public int getRemainingSeatCount() {
        return plane.getPlaneCapacity() - passengers.size();
    }

    public double reservedBagWeight(){
        return plane.getPlaneWeight()/2;
    }

    public double baggageWeightPerPassenger(){
        return reservedBagWeight() / plane.getPlaneCapacity();
    }

    public double bookedInBagsWeight() {
        int totalBags = 0;
        for (Passenger passenger : passengers) {
            int passengerBags = passenger.getNumberOfBags();
                    totalBags += passengerBags;
        }
        return this.baggageWeightPerPassenger() * totalBags;
    }

    public double remainingBagsWeight() {
        return reservedBagWeight()-bookedInBagsWeight();
    }
}


