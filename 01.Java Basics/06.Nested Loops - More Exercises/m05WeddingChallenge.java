package w06Excersice;

import java.util.Scanner;

public class m05WeddingChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = 1; i <= men; i++) {

            for (int j = 1; j <= women; j++) {

                counter++;

                if (counter > tables) {
                    break;


                }
                System.out.printf("(%s <-> %s) ", i, j);

            }
        }
    }
}
