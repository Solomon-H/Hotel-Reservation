public class Room {
    private int roomNumber;
    private boolean isReserved;
    private String guestName;
    private String guestPhoneNumber;
    private int numberOfGuests;
    private int numberOfDays;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isReserved = false;
        this.guestName = "";
        this.guestPhoneNumber = "";
        this.numberOfGuests = 0;
        this.numberOfDays = 0;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void reserve(String guestName, String guestPhoneNumber, int numberOfGuests, int numberOfDays) {
        this.guestName = guestName;
        this.guestPhoneNumber = guestPhoneNumber;
        this.numberOfGuests = numberOfGuests;
        this.numberOfDays = numberOfDays;
        isReserved = true;
    }

    public void cancelReservation() {
        guestName = "";
        guestPhoneNumber = "";
        numberOfGuests = 0;
        numberOfDays = 0;
        isReserved = false;
    }

    public double calculatePrice() {
        if (numberOfGuests <= 2) {
            return 120.99 * numberOfDays;
        } else {
            return 99.99 * numberOfDays;
        }
    }

    public String getGuestName() {
        return guestName;
    }

    public String getGuestPhoneNumber() {
        return guestPhoneNumber;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
    
}
