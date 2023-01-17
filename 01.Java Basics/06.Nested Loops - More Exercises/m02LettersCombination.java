package w06Excersice;

import java.util.Scanner;

public class m02LettersCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String let1 = scanner.nextLine();
        String let2 = scanner.nextLine();
        String let3 = scanner.nextLine();

        char l1 = let1.charAt(0);
        char l2 = let2.charAt(0);
        char l3 = let3.charAt(0);
        int counter=0;

        for (char i = l1; i <= l2; i++) {
            if (i == l3) {
                continue;
            }
            for (char j = l1; j <= l2; j++) {

                if (j == l3) {
                    continue;
                }

                for (char k = l1; k <= l2; k++) {

                    if (k == l3) {
                        continue;

                    }
                    counter++;
                    System.out.printf("%c%c%c ", i, j, k);



                }

            }
        }
        System.out.printf("%d",counter);

    }
}

