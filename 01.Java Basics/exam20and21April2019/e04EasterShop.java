package exam20and21April2019;

import java.util.Scanner;

public class e04EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startQuantity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int currentQuantity = startQuantity;
        int soldEggs=0;

        while (!input.equals("Close")) {
            String action = input;
            int requestedQuantity = Integer.parseInt(scanner.nextLine());

            if (action.equals("Fill")) {
                currentQuantity += requestedQuantity;
            } else if (action.equals("Buy")) {

                if (requestedQuantity > currentQuantity) {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", currentQuantity);
                    break;
                } else {
                    currentQuantity -= requestedQuantity;
                    soldEggs+=requestedQuantity;
                }
            }
            input = scanner.nextLine();
        }
        if (input.equals("Close")) {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.",soldEggs);
        }
    }
}
