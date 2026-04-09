import java.util.*;

// 🔴 Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// 🔵 Goods Bogie Class
class GoodsBogie {
    String type;   // Cylindrical / Rectangular
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    void assignCargo(String cargo) {
        try {
            // Safety rule: Rectangular cannot carry Petroleum
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Rectangular cannot carry Petroleum");
            }

            // Assign cargo if safe
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + type + " → " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }
}

// 🟢 Main Class
public class Train {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        GoodsBogie g2 = new GoodsBogie("Rectangular");

        // Safe assignment
        g1.assignCargo("Petroleum");

        // Unsafe assignment
        g2.assignCargo("Petroleum");

        // Another safe assignment
        g2.assignCargo("Coal");

        System.out.println("Program continues...");
    }
}