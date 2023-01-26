package w01Exercise;

import java.util.Scanner;

public class e05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String password = "";

        for (int i = user.length(); i > 0; i--) {
            password += user.charAt(i-1);

        }

        for (int i = 1; i <= 4; i++) {
            String input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.printf("User %s logged in.", user);
                break;
            } else if (!input.equals(password) && i != 4) {
                System.out.printf("Incorrect password. Try again.%n");
            } else {
                System.out.printf("User %s blocked!", user);
                break;
            }

        }
    }
}
