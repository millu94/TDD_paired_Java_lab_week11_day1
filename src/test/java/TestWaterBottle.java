import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    Bottle bottle;

    @Before
    public void before() {
        bottle = new Bottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canDrink(){
        bottle.haveSip();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void canEmpty(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canFill(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }
}
