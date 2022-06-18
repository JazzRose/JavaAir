import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerTest {

    Passenger neil;
    Flight myFlight;
    Pilot jazz;
    CabinCrewMember holly;
    Plane plane;


    @Before
    public void before() {
        plane = new Plane(Type.BOEING_747);
        neil = new Passenger("Neil", 1);
        jazz = new Pilot("Jazz", Rank.CAPTAIN, "09876");
        holly = new CabinCrewMember("Holly", Rank.FLIGHTATTENDENT);
        myFlight = new Flight(jazz, plane, "1234546", Location.BKK, Location.EDI,"12:00");}

    @Test
    public void getName() {
    }


    @Test
    public void getNumberOfBags() {
    }


    @Test
    public void canSetFlight() {
        myFlight.bookInPassenger(neil,myFlight);
        System.out.println(myFlight.getPassengers());
        assertEquals(Location.BKK, neil.getPassengerFlightDestination());
    }

    @Test
    public void passengerAllocatedSeat(){
        myFlight.bookInPassenger(neil,myFlight);
        assertNotEquals(0, neil.getSeatNumber());
    }
}