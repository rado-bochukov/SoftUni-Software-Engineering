package w01Exercise;

import java.util.Scanner;

public class e10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capital = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double saberPrice=Double.parseDouble(scanner.nextLine());
        double robePrice=Double.parseDouble(scanner.nextLine());
        double beltPrice=Double.parseDouble(scanner.nextLine());

        double sumSabers=Math.ceil(students*1.1)*saberPrice;
        double sumRobes=robePrice*students;
        double sumBelts=0;

        for (int i = 1; i <=students ; i++) {

            sumBelts+=beltPrice;
            if (i%6==0) {
                sumBelts-=beltPrice;
            }
        }
        double totalPrice = sumSabers+sumRobes+sumBelts;
        double difference = Math.abs(capital-totalPrice);

        if (totalPrice<=capital) {
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }else {
            System.out.printf( "George Lucas will need %.2flv more.",difference);
        }

    }
}
