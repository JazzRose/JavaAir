import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot jazz;

    @Before
    public void before(){
        jazz = new Pilot("Jazz",Rank.CAPTAIN,"Jaz1234");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Jazz",jazz.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.CAPTAIN,jazz.getRank());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("Jaz1234",jazz.getLicenseNumber());
    }

    @Test
    public void pilotCanFly(){
        assertEquals("Whooooooo I'm flying!", jazz.flyPlane());
    }
}
