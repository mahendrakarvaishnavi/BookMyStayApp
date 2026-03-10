// Version 2.1

// Abstract Room Class
abstract class Room {

    private String roomType;
    private int beds;
    private double size;
    private double price;

    // Constructor
    public Room(String roomType, int beds, double size, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    // Method to display room details
    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq.ft");
        System.out.println("Price: ₹" + price + " per night");
    }
}

// Single Room Class
class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 200, 2000);
    }
}

// Double Room Class
class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 350, 3500);
    }
}

// Suite Room Class
class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 600, 7000);
    }
}

// Main Application Class
public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App =====");
        System.out.println("Room Types & Availability\n");

        // Create room objects (Polymorphism)
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleRoomAvailability = 10;
        int doubleRoomAvailability = 6;
        int suiteRoomAvailability = 3;

        // Display room details and availability
        System.out.println("Single Room Details:");
        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + singleRoomAvailability);
        System.out.println("--------------------------------");

        System.out.println("Double Room Details:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleRoomAvailability);
        System.out.println("--------------------------------");

        System.out.println("Suite Room Details:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + suiteRoomAvailability);
        System.out.println("--------------------------------");

        System.out.println("Application Terminated.");
    }
}