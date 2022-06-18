import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane boeingPlane;

    @Before
    public void before() {
        boeingPlane = new Plane(Type.BOEING_747);
    }


    @Test
    public void canGetPlaneType() {
        assertEquals(Type.BOEING_747,boeingPlane.getType());
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(400,boeingPlane.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneWeight() {
        assertEquals(180000,boeingPlane.getPlaneWeight());
    }
}