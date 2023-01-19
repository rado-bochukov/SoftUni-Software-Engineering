package exam18and19July2020;

import java.util.Scanner;

public class e03AluminiumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int joineryCount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String shipment = scanner.nextLine();
        boolean invalidOrder = false;

        double orderPrice = 0;

        if (joineryCount < 10) {
            System.out.println("Invalid order");
            invalidOrder = true;

        } else {
            switch (type) {
                case "90X130":
                    if (joineryCount <= 30) {
                        orderPrice = 110 * joineryCount;
                    } else if (joineryCount <= 60) {
                        orderPrice = 110 * joineryCount * 0.95;
                    } else {
                        orderPrice = 110 * joineryCount * 0.92;
                    }
                    break;
                case "100X150":
                    if (joineryCount <= 40) {
                        orderPrice = 140 * joineryCount;
                    } else if (joineryCount <= 80) {
                        orderPrice = 140 * joineryCount * 0.94;
                    } else {
                        orderPrice = 140 * joineryCount * 0.90;
                    }
                    break;
                case "130X180":
                    if (joineryCount <= 20) {
                        orderPrice = 190 * joineryCount;
                    } else if (joineryCount <= 50) {
                        orderPrice = 190 * joineryCount * 0.93;
                    } else {
                        orderPrice = 190 * joineryCount * 0.88;
                    }
                    break;
                case "200X300":
                    if (joineryCount <= 25) {
                        orderPrice = 250 * joineryCount;
                    } else if (joineryCount <= 50) {
                        orderPrice = 250 * joineryCount * 0.91;
                    } else {
                        orderPrice = 250 * joineryCount * 0.86;
                    }
                    break;

            }
        }

        if (shipment.equals("With delivery")) {
            orderPrice += 60;
        }else {
            orderPrice+=0;
        }

        if (joineryCount > 99) {
            orderPrice -= orderPrice * 0.04;
        }
        if (!invalidOrder) {
            System.out.printf("%.2f BGN", orderPrice);
        }
    }
}
