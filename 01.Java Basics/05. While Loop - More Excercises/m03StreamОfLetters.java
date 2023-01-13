package w05Excersise;

import java.util.Scanner;

public class m03StreamОfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int passedLetters = 0;
        int counterO = 0;
        int counterC = 0;
        int counterN = 0;
        String input = scanner.nextLine();
        String progress = "";

        while (!input.equals("End")) {

            char sym = input.charAt(0);

            if (Character.isLetter(sym)) {
                if (input.equals("o") && counterO == 0) {
                    counterO++;
                    passedLetters++;

                } else if (input.equals("c") && counterC == 0) {
                    counterC++;
                    passedLetters++;

                } else if (input.equals("n") && counterN == 0) {
                    counterN++;
                    passedLetters++;

                } else {
                    progress = progress + sym;
                }
            }
            if (passedLetters == 3) {
                System.out.printf("%s ", progress);
                passedLetters = 0;
                counterO = 0;
                counterC = 0;
                counterN = 0;
                progress = "";
            }
            input = scanner.nextLine();
        }
    }
}


