import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle bottle01;

    @Before
    public void before() {
        bottle01 = new WaterBottle();
    }

    @Test
    public void canDrink() {
        bottle01.drink();
        double result = bottle01.getVolume();
        assertEquals(90, result, 0);
    }

    @Test
    public void canBeEmptied() {
        bottle01.empty();
        assertEquals(0,bottle01.getVolume(),0);
    }

    @Test
    public void canBeFilled() {
        bottle01.drink();
        bottle01.drink();
        bottle01.drink();
        bottle01.fill();
        assertEquals(100,bottle01.getVolume(),0);
    }


}

