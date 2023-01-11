package w04Excersise;

import java.util.Scanner;

public class e07Trecking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int groupMusala = 0;
        int groupMonblant = 0;
        int groupKilimandjaro = 0;
        int groupK2 = 0;
        int groupEverest = 0;

        for (int i = 1; i <= groups; i++) {

            int people = Integer.parseInt(scanner.nextLine());

            if (people <= 5) {
                groupMusala += people;
            } else if (people <= 12) {
                groupMonblant += people;
            } else if (people <= 25) {
                groupKilimandjaro += people;
            } else if (people <= 40) {
                groupK2 += people;
            } else {
                groupEverest += people;
            }

        }
        double totalHikers = groupMusala + groupMonblant + groupKilimandjaro + groupK2 + groupEverest;
        double percentMusala = groupMusala / totalHikers * 100;
        double percentMonblant = groupMonblant / totalHikers * 100;
        double percentKilimandjaro = groupKilimandjaro / totalHikers * 100;
        double percentK2 = groupK2 / totalHikers * 100;
        double percentEverest = groupEverest / totalHikers * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMonblant);
        System.out.printf("%.2f%%%n", percentKilimandjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);
    }
}
