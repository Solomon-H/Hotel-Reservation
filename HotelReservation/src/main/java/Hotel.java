import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel(int numberOfRooms) {
        rooms = new ArrayList<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public boolean isRoomAvailable(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isReserved()) {
                return true;
            }
        }
        return false;
    }

    public void bookRoom(int roomNumber, String guestName, String guestPhoneNumber, int numberOfGuests, int numberOfDays) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isReserved()) {
                room.reserve(guestName, guestPhoneNumber, numberOfGuests, numberOfDays);
                System.out.println("Room " + roomNumber + " has been booked.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not available for booking.");
    }

    public void cancelRoomReservation(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isReserved()) {
                room.cancelReservation();
                System.out.println("Reservation for Room " + roomNumber + " has been canceled.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not reserved.");
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (!room.isReserved()) {
                System.out.println("Room " + room.getRoomNumber());
            }
        }
    }

    public List<Room> getBookedRooms() {
        List<Room> bookedRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isReserved()) {
                bookedRooms.add(room);
            }
        }
        return bookedRooms;
    }

    public Room getRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null; 
    }

}


