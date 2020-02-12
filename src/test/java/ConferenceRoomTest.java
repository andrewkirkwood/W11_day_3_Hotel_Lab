import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom(10, "Castle View", 100);
    }

    @Test
    public void check_guests_starts_empty(){
        assertEquals(0, conferenceRoom1.getNumberOfGuests());
    }
}
