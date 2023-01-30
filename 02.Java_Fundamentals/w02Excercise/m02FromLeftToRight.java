package w02Excercise;

import java.util.Scanner;

public class m02FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= lines; i++) {
            String twoNumbers = scanner.nextLine();
            int length = twoNumbers.length();
            String firstNum = "";
            String secondNum = "";
            boolean endFirst = false;
            int sumDigitsNum1 = 0;
            int sumOfDigitsNum2 = 0;

            for (int j = 0; j < length; j++) {
                char current = twoNumbers.charAt(j);
                if (current == ' ') {
                    endFirst = true;
                    continue;
                }
                if (Character.isDigit(current)) {
                    int currentDigit = Integer.parseInt("" + current);

                    if (endFirst) {
                        secondNum += current;
                        sumOfDigitsNum2 += currentDigit;
                        continue;
                    }
                    firstNum += current;
                    sumDigitsNum1 += currentDigit;
                }else {
                    if (endFirst) {
                        secondNum += current;
                        continue;
                    }
                    firstNum += current;
                }
            }
            long num1 = Long.parseLong(firstNum);
            long num2 = Long.parseLong(secondNum);

            if (num1 > num2) {
                System.out.println(sumDigitsNum1);
            } else {
                System.out.println(sumOfDigitsNum2);
            }
        }
    }
}
