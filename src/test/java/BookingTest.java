import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    private Booking booking1;
    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void before(){
        booking1 = new Booking(bedroom1, 8, guest1);
        bedroom1 = new Bedroom(2, 2, "double", 20);
        guest1 = new Guest("Blurb");
    }

    // contains a bedroom
    // bedroom availability

    @Test
    public void booking_contains_a_guest_with_a_Name(){
        assertEquals("Blurb", guest1.getName());
    }

}
