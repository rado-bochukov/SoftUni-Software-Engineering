package w04MethodsExercise;

import java.util.Scanner;

public class e10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {

            if (isSumOfDigitsDivisibleBy8(i) && holdsOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isSumOfDigitsDivisibleBy8(int i) {
        int[] digitsOfNum = splitDigits(i);
        int sum = 0;
        for (int j = 0; j < digitsOfNum.length; j++) {
            sum += digitsOfNum[j];
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean holdsOneOddDigit(int i) {
        int[] digitsOfNum = splitDigits(i);
        int oddCounter = 0;

        for (int j = 0; j < digitsOfNum.length; j++) {

            if (digitsOfNum[j] % 2 != 0) {
                oddCounter++;
            }
        }
        if (oddCounter >= 1) {
            return true;
        } else {
            return false;
        }

    }

    private static int[] splitDigits(int i) {
        String num = "" + i;
        int[] result = new int[num.length()];
        for (int j = 0; j < num.length(); j++) {
            result[j] = num.charAt(j);
        }
        return result;
    }
}

