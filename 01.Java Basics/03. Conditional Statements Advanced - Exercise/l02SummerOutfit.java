package w03Excersice;

import java.util.Scanner;

public class l02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String daytime = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 18) {

            if (daytime.equals("Afternoon") || daytime.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (daytime.equals("Morning")) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }
        } else if (degrees > 18 && degrees <= 24) {
            if (daytime.equals("Morning") || daytime.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (daytime.equals("Afternoon")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }

        } else if (degrees >= 25) {
            switch (daytime) {
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;

            }


        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);

    }
}
