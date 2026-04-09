import java.util.*;

// 🔴 Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 🔵 Passenger Bogie Class
class PassengerBogie {
    String type;
    int capacity;

    // Constructor with validation
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }
}

// 🟢 Main Class
public class Train {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<PassengerBogie> list = new ArrayList<>();

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            list.add(b1);
            System.out.println("Added: " + b1.type + " → " + b1.capacity);

            // Invalid bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            list.add(b2); // will not execute

        } catch (InvalidCapacityException e) {
            System.out.println("\nException: " + e.getMessage());
        }

        System.out.println("\nFinal Bogie List:");
        for (PassengerBogie b : list) {
            System.out.println(b.type + " → " + b.capacity);
        }

        System.out.println("\nProgram continues...");
    }
}