import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int costPerNight;
    private boolean isAvailable;

    public Bedroom(int roomNumber, int capacity, String type, int costPerNight){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.costPerNight = costPerNight;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfGuests() {
        return guests.size();
    }

    public String getType() {
        return type;
    }

    public int getCostPerNight() {
        return this.costPerNight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean available) {
        this.isAvailable = available;
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
