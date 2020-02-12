import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 2, "double");
    }

    @Test
    public void check_room_has_number(){
        assertEquals(2, bedroom.getRoomNumber());
    }
}
