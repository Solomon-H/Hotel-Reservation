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
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();
                    boolean isAvailable = hotel.isRoomAvailable(roomNumber);
                    if (isAvailable) {
                        System.out.println("Room " + roomNumber + " is available.");
                    } else {
                        System.out.println("Room " + roomNumber + " is not available.");
                    }
                    break;

                case 2:
                    System.out.print("Enter room number to book: ");
                    int roomToBook = scanner.nextInt();
                    hotel.bookRoom(roomToBook);
                    break;

                case 3:
                    System.out.print("Enter room number to cancel reservation: ");
                    int roomToCancel = scanner.nextInt();
                    hotel.cancelRoomReservation(roomToCancel);
                    break;

                case 4:
                    hotel.displayAvailableRooms();
                    break;

                case 5:
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
