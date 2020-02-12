import java.util.ArrayList;

public class Booking {
    private Bedroom bedroom;
    private int totalNights;
    private Guest guest;

    public Bedroom getBedroom() {
        return bedroom;
    }

    public Booking(Bedroom bedroom, int totalNights, Guest guest){
        this.bedroom = bedroom;
        this.totalNights = totalNights;
        this.guest = guest;
    }

    public Guest getNumberOfGuests() {
        return this.guest;
    }

    public int getTotalNights() {
        return this.totalNights;
    }
}
