package exam20and21April2019;

import java.util.Scanner;

public class e03EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        switch (destination) {
            case "France":
                if (dates.equals("21-23")) {
                    totalPrice = 30 * nights;
                } else if (dates.equals("24-27")) {
                    totalPrice = 35 * nights;
                } else if (dates.equals("28-31")) {
                    totalPrice = 40 * nights;
                }
                break;
            case "Italy":
                if (dates.equals("21-23")) {
                    totalPrice = 28 * nights;
                } else if (dates.equals("24-27")) {
                    totalPrice = 32 * nights;
                } else if (dates.equals("28-31")) {
                    totalPrice = 39 * nights;
                }
                break;
            case "Germany":
                if (dates.equals("21-23")) {
                    totalPrice = 32 * nights;
                } else if (dates.equals("24-27")) {
                    totalPrice = 37 * nights;
                } else if (dates.equals("28-31")) {
                    totalPrice = 43 * nights;
                }
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.",destination,totalPrice);
    }
}
