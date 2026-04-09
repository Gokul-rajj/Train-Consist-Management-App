import java.util.HashMap;
import java.util.Map;

public class Train {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie -> capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert values using put()
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 100);

        // Display all bogies with capacity
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram continues...");
    }
}