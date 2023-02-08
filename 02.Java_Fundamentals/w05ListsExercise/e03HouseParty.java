package w05ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e03HouseParty {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int numLines=Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i <numLines ; i++) {

            String[] input=scanner.nextLine().split(" ");

            if(input[2].equals("going!")) {
                if (guests.contains(input[0])) {
                    System.out.printf("%s is already in the list!%n",input[0]);
                }else {
                    guests.add(input[0]);
                }
            }else {
                if (!guests.contains(input[0])) {
                    System.out.printf("%s is not in the list!%n",input[0]);
                }else {
                    guests.remove(input[0]);
                }
            }
        }
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
