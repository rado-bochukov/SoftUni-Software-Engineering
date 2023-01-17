package w06Excersice;

import java.util.Scanner;

public class m07PassWordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        char firstSym = 35;
        char secondSym = 64;
        String generatedPassword = "";

        int passWords = Integer.parseInt(scanner.nextLine());
        int passwordCounter = 0;
        boolean maximumReached = false;

        for (int i = 1; i <= a; i++) {
            if (maximumReached) {
                break;
            }
            for (int k = 1; k <= b; k++) {
                generatedPassword=""+firstSym+secondSym+i+k+secondSym+firstSym;
                firstSym++;
                secondSym++;
                passwordCounter++;

                System.out.printf("%s|",generatedPassword);

                if (firstSym > 55) {
                    firstSym = 35;
                }
                if (secondSym > 96) {
                    secondSym = 64;
                }
                if (passwordCounter >= passWords) {
                    maximumReached = true;
                    break;
                }

            }

        }
    }
}



