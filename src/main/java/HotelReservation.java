import java.util.List;
import java.util.Scanner;

public class HotelReservation {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check Room Availability");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Display Available Rooms");
            System.out.println("5. Display Reservation Information");
            System.out.println("6. Exit");
            System.out.print("Enter from the Menu choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    boolean isAvailable = hotel.isRoomAvailable(roomNumber);
                    if (isAvailable) {
                        System.out.println("Room " + roomNumber + " is available.You can book it.");
                    } else {
                        System.out.println("Room " + roomNumber + " is not available.It is already booked.");
                    }
                    break;

                    case 2:
                    System.out.print("Enter room number to book: ");
                    int roomToBook = scanner.nextInt();
                    scanner.nextLine(); 

                    if (hotel.isRoomAvailable(roomToBook)) {
                        System.out.print("Enter guest name: ");
                        String guestName = scanner.nextLine();
                        System.out.print("Enter guest phone number: ");
                        String guestPhoneNumber = scanner.nextLine();
                        System.out.print("Enter number of guests: ");
                        int numberOfGuests = scanner.nextInt();
                        System.out.print("Enter number of days to stay: ");
                        int numberOfDays = scanner.nextInt();

                        hotel.bookRoom(roomToBook, guestName, guestPhoneNumber, numberOfGuests, numberOfDays);
                        System.out.println("Room " + roomToBook + " has been booked.");
                    } else {
                        System.out.println("Room " + roomToBook + " is not available for booking.");
                    }
                    break;

                case 3:
                    System.out.print("Enter room number to cancel reservation: ");
                    int roomToCancel = scanner.nextInt();
                    scanner.nextLine();
                    hotel.cancelRoomReservation(roomToCancel);
                    System.out.println("Reservation for Room " + roomToCancel + " has been canceled.");
                    break;

                case 4:
                    hotel.displayAvailableRooms();
                    break;

                    case 5:
                    System.out.print("Enter room number to display reservation information: ");
                    int roomToDisplay = scanner.nextInt();
                    Room room = hotel.getRoomByNumber(roomToDisplay);
                    if (room != null && room.isReserved()) {
                        System.out.println("Reservation Information for Room " + roomToDisplay + ":");
                        System.out.println("Guest Name: " + room.getGuestName());
                        System.out.println("Guest Phone Number: " + room.getGuestPhoneNumber());
                        System.out.println("Number of Guests: " + room.getNumberOfGuests());
                        System.out.println("Number of Days stayed: " + room.getNumberOfDays());
                        
                        double price = room.calculatePrice();
                        System.out.println("Price: $" + price);
                    } else {
                        System.out.println("Room " + roomToDisplay + " is not reserved or does not exist.");
                    }
                    break;

                case 6:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
