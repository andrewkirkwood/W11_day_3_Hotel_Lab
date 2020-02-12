import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel1;
    private Bedroom bedroom1;
    private ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        hotel1 = new Hotel();
        bedroom1 = new Bedroom(2, 2, "double", 20);
        conferenceRoom1 = new ConferenceRoom(10, "Castle View", 100);
    }

    @Test
    public void check_bedrooms_list_starts_empty(){
        assertEquals(0, hotel1.getTotalBedrooms());
    }

    @Test
    public void check_conference_rooms_list_starts_empty(){
        assertEquals(0, hotel1.getTotalConferenceRooms());
    }

    @Test
    public void can_add_bedroom_to_bedrooms_list(){
        hotel1.addBedroom(bedroom1);
        assertEquals(1, hotel1.getTotalBedrooms());
    }

    @Test
    public void can_add_conference_room_to_conference_rooms(){
        hotel1.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel1.getTotalConferenceRooms());
    }

    @Test
    public void can_check_in_guest(){

    }
}

