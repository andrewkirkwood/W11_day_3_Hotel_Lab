import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int getTotalBedrooms() {
        return this.bedrooms.size();
    }

    public int getTotalConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuest(Guest guest, Bedroom bedroom) {
        if(bedroom.isAvailable() && bedroom.getCapacity() > bedroom.getNumberOfGuests()){
            bedroom.addGuest(guest);
            bedroom.setAvailability(false);
        }
    }

    public void checkInGuest(Guest guest, ConferenceRoom conferenceRoom) {
        if(conferenceRoom.isAvailable() && conferenceRoom.getCapacity() > conferenceRoom.getNumberOfGuests()){
            conferenceRoom.addGuest(guest);
            conferenceRoom.setAvailability(false);
        }
    }

    public void checkOutGuest(Guest guest, Bedroom bedroom) {
        if(bedroom.getNumberOfGuests() > 0){
            bedroom.removeGuest(guest);
            bedroom.setAvailability(true);
        }
    }
}
