package w05Excersise;

import java.util.Scanner;

public class e01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();
        String input = scanner.nextLine();
        int bookCount = 0;

        while (!input.equals(wantedBook)) {


            if (input.equals("No More Books")) {
                break;

            }
            bookCount++;
            input = scanner.nextLine();
        }
        if (input.equals("No More Books")) {

            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", bookCount);

        } else
            System.out.printf("You checked %d books and found it.", bookCount);
    }
}

