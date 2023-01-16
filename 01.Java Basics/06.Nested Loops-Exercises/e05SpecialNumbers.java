package w06Excersice;

import java.util.Scanner;

public class e05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {

            String num = "" + i;
            boolean isFound = true;

            for (int j = 0; j < 4; j++) {

                int sym = Integer.parseInt("" + num.charAt(j));


                if (sym == 0 || n % sym != 0) {
                    isFound = false;

                    break;
                }
            }
            if (isFound) {
                System.out.printf("%s ", i);

            }

        }
    }
}
