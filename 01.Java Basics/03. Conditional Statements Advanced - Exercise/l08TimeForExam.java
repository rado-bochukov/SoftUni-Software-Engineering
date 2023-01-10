package w03Excersice;

import java.util.Scanner;

public class l08TimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minuteExam = Integer.parseInt(scanner.nextLine());
        int hourArriving = Integer.parseInt(scanner.nextLine());
        int minuteArriving = Integer.parseInt(scanner.nextLine());

        int totalMinutesExam = hourExam * 60 + minuteExam;
        int totalMinutesArriving = hourArriving * 60 + minuteArriving;

        if (totalMinutesExam == totalMinutesArriving) {
            System.out.println("On time");
        } else if (totalMinutesArriving > totalMinutesExam) {

            if (totalMinutesArriving - totalMinutesExam < 60) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start", totalMinutesArriving - totalMinutesExam);
            } else {
                System.out.println("Late");
                System.out.printf("%d:%02d hours after the start", ((totalMinutesArriving - totalMinutesExam) / 60), (totalMinutesArriving - totalMinutesExam) % 60);
            }
        } else {
            if (totalMinutesExam - totalMinutesArriving <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", totalMinutesExam - totalMinutesArriving);

            } else if (totalMinutesExam - totalMinutesArriving < 60) {
                System.out.println("Early");
                System.out.printf("%02d minutes before the start", totalMinutesExam - totalMinutesArriving);
            } else {
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", ((totalMinutesExam - totalMinutesArriving) / 60), (totalMinutesExam - totalMinutesArriving) % 60);
            }
        }
    }
}
