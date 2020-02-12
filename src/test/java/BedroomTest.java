import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 2, "double", 20);
    }

    @Test
    public void check_room_has_number(){
        assertEquals(2, bedroom.getRoomNumber());
    }

    @Test
    public void check_room_has_capacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void check_room_guests_starts_empty(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void check_room_has_type(){
        assertEquals("double", bedroom.getType());
    }

    @Test
    public void  check_room_has_cost_per_night(){
        assertEquals(20, bedroom.getCostPerNight());
    }

}
