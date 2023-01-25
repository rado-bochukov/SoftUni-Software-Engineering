package ExamTasks01;

import java.util.Scanner;

public class e06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String currentWinner="";
        int currentHighestScore=0;


        while (!input.equals("Stop")) {

            String name = input;
            int lengthName=name.length();
            int points=0;


            for (int i = 0; i <lengthName ; i++) {
                char currentSym=name.charAt(i);
                int currentNUm = Integer.parseInt(scanner.nextLine());

                if (currentSym==currentNUm) {
                    points+=10;
                }else {
                    points+=2;
                }

            }
            if(points>=currentHighestScore) {
                currentHighestScore=points;
                currentWinner=input;
                points=0;
            }
            input=scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!",currentWinner,currentHighestScore);
    }
}
