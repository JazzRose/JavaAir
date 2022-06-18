import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrewMember holly;

    @Before
    public void before(){
        holly = new CabinCrewMember("Holly",Rank.FLIGHTATTENDENT);
    }

    @Test
    public void cabinCrewHasName(){
        assertEquals("Holly",holly.getName());

    }

    @Test
    public void cabinCrewHasRank(){
        assertEquals(Rank.FLIGHTATTENDENT,holly.getRank());
    }

    @Test
    public void canChangeRank(){
        holly.setRank(Rank.PURSER);
        assertEquals(Rank.PURSER,holly.getRank());
    }
    @Test
    public void canMessagePassengers(){
        assertEquals("Sir, This is a Wendy's", holly.speakOnIntercom());
    }

}
