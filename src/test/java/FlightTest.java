import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight myFlight;
    Flight smallFlight;
    Pilot jazz;
    CabinCrewMember holly;
    Plane plane;
    Plane smallPlane;
    Passenger neil;
    Passenger lucy;
    Passenger vicki;


    @Before
    public void before() {
        plane = new Plane(Type.BOEING_747);
        smallPlane = new Plane(Type.TEENY_PLANE);
        neil = new Passenger("Neil", 1);
        lucy = new Passenger("Lucy", 3);
        vicki = new Passenger("Vicki", 10);
        jazz = new Pilot("Jazz", Rank.CAPTAIN, "09876");
        holly = new CabinCrewMember("Holly", Rank.FLIGHTATTENDENT);
        myFlight = new Flight(jazz, plane, "1234546", Location.BKK, Location.EDI,"12:00");
        smallFlight = new Flight(jazz, smallPlane, "1234", Location.RKV, Location.GLA, "05:00");

    }

    @Test
    public void canGetFlightPLaneCapacity() {
        assertEquals(400, myFlight.getPlaneCapacity());
    }

    @Test
    public void canGetFlightWeight() {
        assertEquals(180000, myFlight.getPlaneWeight());
    }

    @Test
    public void canGetFlightDestinationCountry() {
        assertEquals("Thailand", myFlight.getDestinationCountry());
    }

    @Test
    public void canGetFlightDestinationCity() {
        assertEquals("Bangkok", myFlight.getDestinationCity());
    }

    @Test
    public void canGetFlightDepartureCountry() {
        assertEquals("Scotland", myFlight.getDepartureCountry());
    }

    @Test
    public void canGetFlightDepartureCity() {
        assertEquals("Edinburgh", myFlight.getDepartureCity());
    }

    @Test
    public void canCheckPlaneStartsEmpty() {
        assertEquals(0, myFlight.getPassengerCount());
    }

    @Test
    public void canBookIntoFlight() {
        myFlight.bookInPassenger(neil, myFlight);
        assertEquals(1, myFlight.getPassengerCount());
    }

    @Test
    public void getAvailableSeats() {
        smallFlight.bookInPassenger(neil, myFlight);
        assertEquals(1, smallFlight.getRemainingSeatCount());

    }

    @Test
    public void getAvailableSeatsPlaneFull() {
        smallFlight.bookInPassenger(neil, myFlight);
        smallFlight.bookInPassenger(vicki, myFlight);
        assertEquals(0, smallFlight.getRemainingSeatCount());

    }

    @Test
    public void tooManyForFlight() {
        smallFlight.bookInPassenger(neil, myFlight);
        smallFlight.bookInPassenger(lucy, myFlight);
        smallFlight.bookInPassenger(vicki, myFlight);
        assertEquals(2, smallFlight.getPassengerCount());
    }

    @Test
    public void getBaggageWeightForFlight(){
        assertEquals(225.00, myFlight.baggageWeightPerPassenger(),0.00);
    }

    @Test
    public void getTotalBookedWeight(){
        myFlight.bookInPassenger(lucy, myFlight);
        assertEquals(675.00,myFlight.bookedInBagsWeight(),0.00);
    }

    @Test
    public void getRemainingBaggageWeight(){
        myFlight.bookInPassenger(lucy, myFlight);
        assertEquals(89325.00,myFlight.remainingBagsWeight(),0.00);
    }
}
