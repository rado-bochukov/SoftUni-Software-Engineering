package w05Excersise;

import java.util.Scanner;

public class m01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergentBottles = Integer.parseInt(scanner.nextLine());
        int detergent = detergentBottles * 750;

        int dishes = 0;
        int pots = 0;
        int countWashes = 0;
        boolean isThereMoreDishes = true;

        while (detergent >= 0) {
            String input = scanner.nextLine();

            if (input.equals("End")) {
                isThereMoreDishes = false;
                break;
            }

            int washedItems = Integer.parseInt(input);
            countWashes++;
            if (countWashes % 3 == 0) {
                pots += washedItems;
                detergent -= washedItems*15;

            } else {
                dishes += washedItems;
                detergent-= washedItems*5;
            }

        }if (isThereMoreDishes) {
            System.out.printf("Not enough detergent, %d ml. more necessary!",Math.abs(detergent));
        }else {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n",dishes , pots);
            System.out.printf("Leftover detergent %d ml.",detergent);
        }
    }
}
