package w02Excercise;

import java.util.Scanner;

public class e04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sumOfChars=0;

        for (int i = 1; i <=lines ; i++) {

            char sym = scanner.nextLine().charAt(0);
            sumOfChars+=(int)sym;

        }
        System.out.printf("The sum equals: %d",sumOfChars);
    }
}
