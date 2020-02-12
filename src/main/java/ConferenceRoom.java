import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> guests;
    private String name;
    private int costPerDay;

    public int getCapacity() {
        return capacity;
    }

    private boolean isAvailable;

    public ConferenceRoom(int capacity, String name, int costPerDay){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.name = name;
        this.costPerDay = costPerDay;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean available) {
        isAvailable = available;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if(getNumberOfGuests() < this.capacity && isAvailable()){
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
