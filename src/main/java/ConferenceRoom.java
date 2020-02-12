import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> guests;
    private String name;
    private int costPerDay;

    public ConferenceRoom(int capacity, String name, int costPerDay){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.name = name;
        this.costPerDay = costPerDay;
    }

    public int getNumberOfGuests() {
        return this.guests.size();
    }
}
