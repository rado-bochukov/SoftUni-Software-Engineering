package ExamTasks01;

import java.util.Scanner;

public class e06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean multiply = false;
        double currentHighestScore = 0;
        String mostPowerfulWord = "";

        while (!input.equals("End of words")) {

            int length = input.length();

            double currentPoints = 0;

            for (int i = 0; i < length; i++) {

                char sym = input.charAt(i);
                currentPoints += sym;
            }
            if (input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o' || input.charAt(0) == 'u' || input.charAt(0) == 'y' ||
                    input.charAt(0) == 'A' || input.charAt(0) == 'E' || input.charAt(0) == 'I' || input.charAt(0) == 'O' || input.charAt(0) == 'U' || input.charAt(0) == 'Y') {

                currentPoints *= length;
            } else {
                currentPoints /= length;
            }

            if (currentPoints >= currentHighestScore) {
                currentHighestScore = currentPoints;
                mostPowerfulWord = input;
            }
            input = scanner.nextLine();

        }
        System.out.printf("The most powerful word is %s - %.0f", mostPowerfulWord, currentHighestScore);


    }
}
