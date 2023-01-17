package w06Excersice;

import java.util.Scanner;

public class m12TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int fourthPassword = 0;
        boolean isFound = false;

        for (int i = 1; i <= 9; i++) {

            for (int j = i + 1; j <= 9; j++) {

                for (int k = 1; k <= 9; k++) {

                    for (int l = 1; l <= 9; l++) {

                        if (l >= k) {
                            continue;
                        }
                        if (i * j + k * l == M) {

                            System.out.printf("%d%d%d%d ", i, j, k, l);
                            counter++;

                            if (counter == 4) {
                                fourthPassword = i * 1000 + j * 100 + k * 10 + l;
                                isFound = true;
                            }
                        }
                    }
                }
            }

        }
        if (isFound) {
            System.out.println();
            System.out.printf("Password: %d", fourthPassword);
        } else {
            System.out.println();
            System.out.println("No!");
        }
    }
}
