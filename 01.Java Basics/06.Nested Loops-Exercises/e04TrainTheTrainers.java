package w06Excersice;

import java.util.Scanner;

public class e04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double sumPresentationGrades = 0;
        int presentationCount = 0;

        while (!input.equals("Finish")) {
            double sumGrades = 0;
            presentationCount += 1;

            for (int i = 1; i <= juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades += grade;

                if (i == juryCount) {

                    double averageGrade = sumGrades / juryCount;
                    System.out.printf("%s - %.2f.%n", input, averageGrade);
                    sumPresentationGrades += averageGrade;
                    input = scanner.nextLine();
                }

            }

        }
        double averagePresentationsGrade=sumPresentationGrades/presentationCount;
        System.out.printf("Student's final assessment is %.2f.",averagePresentationsGrade );
    }
}
