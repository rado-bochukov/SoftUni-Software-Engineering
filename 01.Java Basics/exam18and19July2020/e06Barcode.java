package exam18and19July2020;

import java.util.Scanner;

public class e06Barcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        String firstNum = "" + start;
        String secondNum = "" + end;

        for (int i = firstNum.charAt(0); i <= secondNum.charAt(0); i++) {

            if (i % 2 == 0) {
                continue;
            } else {
                for (int j = firstNum.charAt(1); j <= secondNum.charAt(1); j++) {

                    if (j % 2 == 0) {
                        continue;
                    } else {
                        for (int k = firstNum.charAt(2); k <= secondNum.charAt(2); k++) {

                            if (k % 2 == 0) {
                                continue;
                            } else {
                                for (int l = firstNum.charAt(3); l <= secondNum.charAt(3); l++) {

                                    if (l % 2 == 0) {
                                        continue;
                                    } else {

                                        System.out.printf("%c%c%c%c ", i, j, k, l);
                                    }

                                }
                            }

                        }
                    }

                }
            }


        }


    }
}

