import java.util.ArrayList;
import java.util.List;

public class Train {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues
        System.out.println("System ready to add bogies...");
    }
}
