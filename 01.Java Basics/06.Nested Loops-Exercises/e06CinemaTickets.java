package w06Excersice;

import java.util.Scanner;

public class e06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int countStudents = 0;
        int countStandard = 0;
        int countKids = 0;
        int totalAllMovies = 0;

        while (!input.equals("Finish")) {

            int seats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int totalCountMovie = 0;

            while (!ticketType.equals("End")) {


                totalCountMovie++;
                totalAllMovies++;

                switch (ticketType) {
                    case "student":
                        countStudents++;
                        break;
                    case "standard":
                        countStandard++;
                        break;
                    case "kid":
                        countKids++;
                        break;
                }
                if (totalCountMovie == seats) {
                    break;
                }
                ticketType = scanner.nextLine();

            }
            double filledHall = 1.0 * totalCountMovie / seats * 100;
            System.out.printf("%s - %.2f%% full.%n", input, filledHall);
            input = scanner.nextLine();

        }
        double studentTicketsPercentage = 1.0 * countStudents / totalAllMovies * 100;
        double standardTicketsPercentage = 1.0 * countStandard / totalAllMovies * 100;
        double kidsTicketsPercentage = 1.0 * countKids / totalAllMovies * 100;

        System.out.printf("Total tickets: %d%n", totalAllMovies);
        System.out.printf("%.2f%% student tickets.%n", studentTicketsPercentage);
        System.out.printf("%.2f%% standard tickets.%n", standardTicketsPercentage);
        System.out.printf("%.2f%% kids tickets.%n", kidsTicketsPercentage);
    }
}
