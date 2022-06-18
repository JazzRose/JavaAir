import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FlightManagerTest  {

    Flight myFlight;
    Flight smallFlight;
    Pilot jazz;
    Plane plane;
    Plane smallPlane;
    Passenger neil;
    Passenger lucy;
    Passenger vicki;
    CabinCrewMember holly;

    @Before
    public void before(){
            plane = new Plane(Type.BOEING_747);
            smallPlane = new Plane(Type.TEENY_PLANE);
            neil = new Passenger("Neil", 1);
            lucy = new Passenger("Lucy", 3);
            vicki = new Passenger("Vicki", 10);
            jazz = new Pilot("Jazz", Rank.CAPTAIN, "09876");
            holly = new CabinCrewMember("Holly", Rank.FLIGHTATTENDENT);
            myFlight = new Flight(jazz, plane, "1234546", Location.BKK, Location.EDI, "12:00");
            smallFlight = new Flight(jazz, smallPlane, "1234", Location.RKV, Location.GLA, "05:00");
    }

    @Test
    public void getBaggageWeightForFlight(){
        assertEquals(225.00, myFlight.baggageWeightPerPassenger(),0.00);
    }
}

