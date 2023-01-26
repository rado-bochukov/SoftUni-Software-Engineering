package w01Exercise;

import java.util.Scanner;

public class m03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();
        double totalSpend = 0;
        boolean outOfMoney = false;

        while (!input.equals("Game Time")) {

            double gamePrice = 0;


            String gameName = input;

            switch (gameName) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    input = scanner.nextLine();
                    continue;
            }
            if (gamePrice > balance) {
                System.out.println("Too Expensive");
                input = scanner.nextLine();
                continue;
            } else {
                System.out.printf("Bought %s%n", gameName);
            }

            totalSpend += gamePrice;
            balance -= gamePrice;

            if (balance <= 0) {
                System.out.println("Out of money!");
                outOfMoney = true;
                break;
            }
            input = scanner.nextLine();

        }
        if (!outOfMoney) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, balance);
        }

    }
}
