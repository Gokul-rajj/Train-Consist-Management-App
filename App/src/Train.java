import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Train {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("\nEnter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // Create matchers
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // Validate using matches()
        if (m1.matches()) {
            System.out.println("\nValid Train ID");
        } else {
            System.out.println("\nInvalid Train ID");
        }

        if (m2.matches()) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }

        System.out.println("\nProgram continues...");

        sc.close();
    }
}