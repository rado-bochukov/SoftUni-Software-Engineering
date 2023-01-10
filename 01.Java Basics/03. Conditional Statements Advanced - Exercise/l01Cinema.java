package w03Excersice;

import java.util.Scanner;

public class l01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        int seats= row*col;
        double ticket = 0;

        switch (movie){
            case "Premiere":
                ticket = 12.00;
                break;
            case "Normal":
                ticket = 7.50;
                break;
            case "Discount":
                ticket = 5.00;
        } double income = seats*ticket;
        System.out.printf("%.2f leva",income);
    }
}
