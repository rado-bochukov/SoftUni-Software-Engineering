package w06Excersice;

import java.util.Scanner;

public class m09SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isFound = false;


        for (int i = start; i <= end; i++) {
            if (isFound) {
                break;
            }
            for (int j = start; j <= end; j++) {

                counter++;

                if (i + j == magicNumber) {

                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    break;
                }
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);

        }
    }
}
