import java.util.*;

class GoodsBogie {
    String type;   // Cylindrical / Rectangular / Open
    String cargo;  // Petroleum / Coal / Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class Train {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of goods bogies
        List<GoodsBogie> goods = new ArrayList<>();
        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goods.add(new GoodsBogie("Rectangular", "Coal"));
        goods.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goods.add(new GoodsBogie("Open", "Grain"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        for (GoodsBogie g : goods) {
            System.out.println(g.type + " → " + g.cargo);
        }

        // 🔹 Safety validation using allMatch()
        boolean isSafe = goods.stream()
                .allMatch(g ->
                        !g.type.equals("Cylindrical") ||
                                g.cargo.equals("Petroleum")
                );

        // Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }

        System.out.println("\nProgram continues...");
    }
}