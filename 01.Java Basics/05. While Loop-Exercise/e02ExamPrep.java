package w05Excersise;

import java.util.Scanner;

public class e02ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGradesCount = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int poorGradesRecieved = 0;
        double sumGrades = 0;
        int tasksAmount = 0;
        boolean isPassed = true;
        String lastProblem = "";

        while (!input.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            tasksAmount++;
            if (grade <= 4) {
                poorGradesRecieved++;

                if (poorGradesRecieved == poorGradesCount) {
                    isPassed = false;
                    break;
                }
            }
            sumGrades += grade;
            lastProblem = input;

            input = scanner.nextLine();
        }
        double averageGrade = sumGrades / tasksAmount;

        if (isPassed) {
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n", tasksAmount);
            System.out.printf("Last problem: %s", lastProblem);

        } else {
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        }


    }
}
