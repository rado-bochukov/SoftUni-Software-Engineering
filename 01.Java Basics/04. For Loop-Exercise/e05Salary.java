package w04Excersise;

import java.util.Scanner;

public class e05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        double fine1 = 0;
        double fine2 = 0;
        double fine3 = 0;

        for (int i = 1; i <= openTabs; i++) {

            String tab = scanner.nextLine();

            switch (tab) {
                case "Facebook":
                    fine1 += 150;
                    break;
                case "Instagram":
                    fine2 += 100;
                    break;
                case "Reddit":
                    fine3 += 50;
                    break;
            }
        }
        double totalFine = fine1 + fine2 + fine3;

        double diff = Math.abs(salary - totalFine);

        if (salary <= totalFine) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", diff);
        }


    }
}
