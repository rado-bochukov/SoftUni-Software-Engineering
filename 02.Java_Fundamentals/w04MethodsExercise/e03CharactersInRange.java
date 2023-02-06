package w04MethodsExercise;

import java.util.Scanner;

public class e03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sym1 = scanner.nextLine().charAt(0);
        char sym2 = scanner.nextLine().charAt(0);

        String result = getCharsInRange(sym1, sym2);

        System.out.println(result);
    }

    private static String getCharsInRange(char sym1, char sym2) {

        String result = "";

        if (sym1 < sym2) {

            for (int i = sym1 + 1; i < sym2; i++) {

                result += (char) i + " ";

            }
            return result;
        } else {
            for (int i = sym2 + 1; i < sym1; i++) {

                result += (char) i + " ";

            }
            return result;
        }

    }
}
