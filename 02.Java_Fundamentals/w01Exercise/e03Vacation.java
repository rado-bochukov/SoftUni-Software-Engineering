package w01Exercise;

import java.util.Scanner;

public class e03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();


        double pricePerPerson = 0;

        switch (typeOfGroup) {
            case "Students":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 8.45;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 9.8;
                } else if (dayOfWeek.equals("Sunday")) {
                    pricePerPerson = 10.46;
                }
                break;
            case "Business":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 10.90;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 15.60;
                } else if (dayOfWeek.equals("Sunday")) {
                    pricePerPerson = 16.0;
                }
                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")) {
                    pricePerPerson = 15.0;
                } else if (dayOfWeek.equals("Saturday")) {
                    pricePerPerson = 20.0;
                } else if (dayOfWeek.equals("Sunday")) {
                    pricePerPerson = 22.50;
                }
                break;
        }
        double regularPrice = pricePerPerson*group;
        double discount=0;

        if (typeOfGroup.equals("Students") && group>=30) {
            discount=regularPrice*0.15;
        }else if (typeOfGroup.equals("Business") && group>=100) {
            discount = pricePerPerson*10;
        }else if (typeOfGroup.equals("Regular")&&group>=10 && group<=20) {
            discount=regularPrice*0.05;

        }

        double totalPrice = regularPrice-discount;

        System.out.printf("Total price: %.2f",totalPrice);

    }
}
