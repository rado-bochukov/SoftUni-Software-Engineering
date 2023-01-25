package preExam2210;

import java.util.Scanner;

public class e03CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String service = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (service) {
            case "standard":
                if (weight < 1) {
                    price = 0.03 * distance;
                } else if (weight >= 1 && weight < 10) {
                    price = 0.05 * distance;
                } else if (weight >= 10 && weight < 40) {
                    price = 0.1 * distance;
                } else if (weight >= 40 && weight < 90) {
                    price = 0.15 * distance;
                } else if (weight >= 90 && weight < 150) {
                    price = 0.2 * distance;
                }
                break;
            case "express":
                if (weight < 1) {
                    price = (0.03 * distance) + (weight * 0.03 * 0.8*distance);
                } else if (weight >= 1 && weight < 10) {
                    price = (0.05 * distance) + (weight * 0.05 * 0.4*distance);
                } else if (weight >= 10 && weight < 40) {
                    price = (0.1 * distance) + (weight * 0.1 * 0.05*distance);
                } else if (weight >= 40 && weight < 90) {
                    price = (0.15 * distance) + (weight * 0.15 * 0.02*distance);
                } else if (weight >= 90 && weight < 150) {
                    price = (0.2 * distance) + (weight * 0.2 * 0.01*distance);
                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, price);
    }
}
