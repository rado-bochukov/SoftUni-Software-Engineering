package w06Excersice;

import java.util.Scanner;

public class e02EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int lastNumNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= lastNumNum; i++) {
            String currentNum = "" + i;
            int sumEven = 0;
            int sumOdd = 0;

            for (int j = 0; j < currentNum.length(); j++) {

                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));

                if (j % 2 == 0) {
                    sumEven += currentDigit;
                } else {
                    sumOdd += currentDigit;
                }
            }

            if (sumEven == sumOdd) {
                System.out.printf("%d ", i);
            }

        }
    }
}
