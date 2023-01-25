package preExam2210;

import java.util.Scanner;

public class e04GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());

        double totalLitres=0;
        double totalAbv = 0;

        for (int i = 0; i <days ; i++) {
            double currentLitres = Double.parseDouble(scanner.nextLine());
            double abv = Double.parseDouble(scanner.nextLine());
            totalLitres+=currentLitres;
            totalAbv+=abv*currentLitres;

        }

        double averageAbv = totalAbv/totalLitres;

        System.out.printf("Liter: %.2f%n",totalLitres);
        System.out.printf("Degrees: %.2f%n",averageAbv);

        if (averageAbv<38) {
            System.out.println("Not good, you should baking!");
        }else if (averageAbv>=38 && averageAbv<42) {
            System.out.println("Super!");
        }else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
