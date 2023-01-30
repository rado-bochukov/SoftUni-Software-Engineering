package w02Excercise;

import java.util.Scanner;

public class m04RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int endRange = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= endRange; i++) {
            boolean isPrime = true;

            for (int devider = 2; devider < i; devider++) {
                if (i % devider == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }

    }
}

