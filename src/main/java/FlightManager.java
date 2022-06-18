public class FlightManager {

    Flight flight;
    Plane plane;

    public double baggageWeightPerPassenger(){
        double reserved = flight.getPlaneWeight()/2;
        return reserved/ flight.getPlaneCapacity();
    }
}
