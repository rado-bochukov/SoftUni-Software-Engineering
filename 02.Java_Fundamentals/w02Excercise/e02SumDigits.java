package w02Excercise;

import java.util.Scanner;

public class e02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int length = number.length();
        int sumDigits=0;

        for (int i = 0; i <length; i++) {
            int digit = Integer.parseInt(""+number.charAt(i));
            sumDigits+=digit;
        }

        System.out.println(sumDigits);
    }
}
