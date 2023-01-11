package w04Excersise;

import java.util.Scanner;

public class t04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());

        double topGrades = 0;
        double between4to499 = 0;
        double between3to399 = 0;
        double failed = 0;
        double totalGrade = 0;

        for (int i = 1; i <= students; i++) {

            double grade = Double.parseDouble(scanner.nextLine());
            totalGrade += grade;

            if (grade < 3) {
                failed += 1;
            } else if (grade < 4) {
                between3to399 += 1;
            } else if (grade < 5) {
                between4to499 += 1;
            } else {
                topGrades += 1;
            }


        }
        double averageGrade = totalGrade / students;

        double percentTop = topGrades / students * 100.0;
        double percent4_5 = between4to499 / students * 100.0;
        double percent3_4 = between3to399 / students * 100.0;
        double percentFailed = failed / students * 100.0;

        System.out.printf("Top students: %.2f%%%n", percentTop);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percent4_5);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percent3_4);
        System.out.printf("Fail: %.2f%%%n", percentFailed);
        System.out.printf("Average: %.2f", averageGrade);


    }
}
