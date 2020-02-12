import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(2, 2, "double", 20);
        guest1 = new Guest("Sam");
    }

    @Test
    public void check_room_has_number(){
        assertEquals(2, bedroom1.getRoomNumber());
    }

    @Test
    public void check_room_has_capacity(){
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void check_room_guests_starts_empty(){
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

    @Test
    public void check_room_has_type(){
        assertEquals("double", bedroom1.getType());
    }

    @Test
    public void  check_room_has_cost_per_night(){
        assertEquals(20, bedroom1.getCostPerNight());
    }

    @Test
    public void check_room_can_add_guest_to_bedroom_when_capacity_is_available(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void check_room_can_add_guest_to_bedroom_when_capacity_is_NOT_available(){
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest1);
        assertEquals(2, bedroom1.getNumberOfGuests());
    }

    @Test
    public void check_room_can_remove_guest(){
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

}
