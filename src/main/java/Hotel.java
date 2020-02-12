import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bookings = new ArrayList<Booking>();
    }

    public int getTotalBedrooms() {
        return this.bedrooms.size();
    }

    public int getTotalConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public int getTotalBookings() {
        return bookings.size();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public Booking checkInGuest(Guest guest, Bedroom bedroom) {
        if(bedroom.isAvailable() && bedroom.getCapacity() > bedroom.getNumberOfGuests()){
            bedroom.addGuest(guest);
            bedroom.setAvailability(false);
//            createBooking(bedroom);
        }
        return null;
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

    public Booking createBooking(Bedroom bedroom, int totalNights, Guest guest) {
        Booking booking = new Booking(bedroom, totalNights, guest);
        this.bookings.add(booking);
        return booking;
    }

    public boolean getBooking(Booking booking){
        return this.bookings.contains(booking);
    }

    public int getBookingTotalCost(Booking booking) {
        return booking.getBedroom().getCostPerNight() * booking.getTotalNights();
    }
}
