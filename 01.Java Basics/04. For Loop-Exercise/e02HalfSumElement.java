package w04Excersise;

import java.util.Scanner;

public class e02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;

        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= count; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum1 += num;

            if (num > maxNum) {
                maxNum = num;
            }


        }
        int sumRest = sum1 - maxNum;
        int diff = Math.abs(sumRest - maxNum);
        if (diff == 0) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumRest);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);

        }

    }
}
