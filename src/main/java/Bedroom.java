import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int costPerNight;

    public Bedroom(int roomNumber, int capacity, String type, int costPerNight){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.costPerNight = costPerNight;
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

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
