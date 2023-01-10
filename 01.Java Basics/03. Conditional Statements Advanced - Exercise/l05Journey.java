package w03Excersice;

import java.util.Scanner;

public class l05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budged = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double spending = 0;

        if (budged <= 100) {
            switch (season) {
                case "summer":
                    spending = budged * 0.3;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Camp - %.2f", spending);
                    break;
                case "winter":
                    spending = budged * 0.7;
                    System.out.println("Somewhere in Bulgaria");
                    System.out.printf("Hotel - %.2f", spending);
                    break;
            }
        } else if (budged <= 1000) {
            switch (season) {
                case "summer":
                    spending = budged * 0.4;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Camp - %.2f", spending);
                    break;
                case "winter":
                    spending = budged * 0.8;
                    System.out.println("Somewhere in Balkans");
                    System.out.printf("Hotel - %.2f", spending);
                    break;
            }
        } else {
            spending = budged * 0.9;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", spending);

        }
    }
}
