package w06Excersice;

import java.util.Scanner;

public class m13PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPair = Integer.parseInt(scanner.nextLine());
        int secondPair = Integer.parseInt(scanner.nextLine());
        int firstRange = Integer.parseInt(scanner.nextLine());
        int secondRange = Integer.parseInt(scanner.nextLine());

        int count1 = 0;
        int count2 = 0;
        String number = "";


        for (int i = firstPair; i <= firstPair + firstRange; i++) {

            for (int l = 2; l <= i / 2; l++) {
                if (i % l == 0) {
                    count1++;
                }
            }
            if (count1 > 0) {
                count1 = 0;
                continue;
            }
            for (int j = secondPair; j <= secondPair + secondRange; j++) {

                for (int k = 2; k <= j / 2; k++) {
                    if (j % k == 0) {
                        count2++;
                    }
                }
                if (count2 == 0) {
                    number = "" + i + j;

                } else {
                    count2 = 0;
                    continue;
                }
                System.out.println(number);

            }
        }
    }
}
