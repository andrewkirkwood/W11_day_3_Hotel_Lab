import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;
    private Guest guest1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom(4, "Castle View", 100);
        guest1 = new Guest("Sam");
    }

    @Test
    public void check_guests_starts_empty(){
        assertEquals(0, conferenceRoom1.getNumberOfGuests());
    }

    @Test
    public void can_add_guest_when_capacity_is_available(){
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.getNumberOfGuests());
    }
    @Test
    public void can_add_guest_when_capacity_is_NOT_available(){
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.addGuest(guest1);
        assertEquals(4, conferenceRoom1.getNumberOfGuests());
    }

    @Test
    public void can_remove_guest(){
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.removeGuest(guest1);
        assertEquals(0, conferenceRoom1.getNumberOfGuests());
    }
}
