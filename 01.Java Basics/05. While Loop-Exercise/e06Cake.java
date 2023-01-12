package w05Excersise;

import java.util.Scanner;

public class e06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side1 = Integer.parseInt(scanner.nextLine());
        int side2 = Integer.parseInt(scanner.nextLine());

        int totalPieces = side1 * side2;
        boolean doesMorePiecesNeeded = true;

        while (totalPieces > 0) {
            String input = scanner.nextLine();

            if (input.equals("STOP")) {
                doesMorePiecesNeeded = false;
                break;
            }
            int piecesTaken = Integer.parseInt(input);
            totalPieces -= piecesTaken;

        }
        if (doesMorePiecesNeeded) {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(totalPieces));

        }else {
            System.out.printf("%d pieces are left.",totalPieces);
        }


    }
}
