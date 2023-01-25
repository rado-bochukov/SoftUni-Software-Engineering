package preExam2210;

import java.util.Scanner;

public class e06UniquePinCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int thirdDigit = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= firstDigit; i++) {

            if (i % 2 != 0) {
                continue;
            }
            for (int j = 1; j <= secondDigit; j++) {

                if (j != 2 && j != 3 && j != 5 && j != 7) {
                    continue;
                }
                for (int k = 1; k <= thirdDigit; k++) {

                    if (k % 2 != 0) {
                        continue;
                    } else {
                        System.out.printf("%d %d %d %n", i, j, k);
                    }

                }
            }

        }
    }
}
