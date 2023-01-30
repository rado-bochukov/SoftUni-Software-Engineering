package w02Excercise;

import java.util.Scanner;

public class e09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int totalSpiceMined = 0;
        int days = 0;
        if (startingYield < 100) {

            System.out.println(days);
            System.out.println(totalSpiceMined);

        } else {
            while (startingYield >= 100) {

                days++;
                totalSpiceMined += startingYield - 26;
                startingYield -= 10;
            }
            totalSpiceMined -= 26;
            System.out.println(days);
            System.out.println(totalSpiceMined);
        }
    }
}
