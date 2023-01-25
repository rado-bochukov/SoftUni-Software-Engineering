package ExamTasks01;

import java.util.Scanner;

public class e03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String tripPackage = scanner.nextLine();
        String vipDiscount = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());


        double regularPrice = 0;
        boolean invalidInputFound = false;


        switch (town) {
            case "Bansko":
            case "Borovets":
                switch (tripPackage) {
                    case "noEquipment":
                        if (vipDiscount.equals("yes")) {
                            regularPrice = 80 * days * 0.95;
                        } else {
                            regularPrice = 80 * days;
                        }
                        break;
                    case "withEquipment":
                        if (vipDiscount.equals("yes")) {
                            regularPrice = 100 * days * 0.90;
                        } else {
                            regularPrice = 100 * days;
                        }
                        break;
                    default:
                        invalidInputFound = true;
                        break;
                }
                break;
            case "Varna":
            case "Burgas":
                switch (tripPackage) {
                    case "noBreakfast":
                        if (vipDiscount.equals("yes")) {
                            regularPrice = 100 * days * 0.93;
                        } else {
                            regularPrice = 100 * days;
                        }
                        break;
                    case "withBreakfast":
                        if (vipDiscount.equals("yes")) {
                            regularPrice = 130 * days * 0.88;
                        } else {
                            regularPrice = 130 * days;
                        }
                        break;
                    default:
                        invalidInputFound = true;
                        break;
                }
                break;
            default:
                invalidInputFound = true;
                break;
        }
        if (!invalidInputFound) {
            if (days < 1) {
                System.out.println("Days must be positive number!");
            } else if (days>7){
                System.out.printf("The price is %.2flv! Have a nice time!", regularPrice-(regularPrice/days));
            }else {
                System.out.printf("The price is %.2flv! Have a nice time!", regularPrice);
            }
        } else {
            System.out.println("Invalid input!");
        }
    }
}
