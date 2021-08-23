import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle (100);
    }

    @Test
    public void hasVolume100(){
        assertEquals(100, waterbottle.hasVolume100());
    }

    @Test
    public void decreaseVolumeBy10(){
        assertEquals(90, waterbottle.decreaseVolumeBy10());
    }

    @Test
    public void empty(){
        assertEquals(0,waterbottle.empty());
    }

    @Test
    public void fill(){
        assertEquals(100,waterbottle.fill());
    }
}
