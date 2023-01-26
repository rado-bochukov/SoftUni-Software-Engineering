package w01Exercise;

import java.util.Scanner;

public class m04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int length = input.length();
        String currentWord="";

        for (int i = length-1; i >=0 ; i--) {

            currentWord+=input.charAt(i);
        }
        System.out.println(currentWord);
    }
}
