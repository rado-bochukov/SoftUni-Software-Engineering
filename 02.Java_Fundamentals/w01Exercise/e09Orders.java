package w01Exercise;

import java.util.Scanner;

public class e09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());

        double pricePerCapsule = 0;
        int days = 0;
        int capsulesCount = 0;

        double totalSum=0;


        for (int i = 1; i <=countOrders ; i++) {

            pricePerCapsule=Double.parseDouble(scanner.nextLine());
            days=Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = pricePerCapsule*capsulesCount*days;

            System.out.printf("The price for the coffee is: $%.2f%n",orderPrice);
            totalSum+=orderPrice;

        }
        System.out.printf("Total: $%.2f",totalSum);
    }
}
