package w05ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class m01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String>numbers= Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        List<String> characters=Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());

        String output="";

        for (String number : numbers) {

            int sumDigits=0;

           while (number.length()>0){

                sumDigits+=Integer.parseInt(number.substring(0,1));
                number=number.substring(1);

                if(number.length()==1){
                    sumDigits+=Integer.parseInt(number);
                    break;
                }
            }
            if(sumDigits<characters.size()) {
                output+=""+characters.get(sumDigits);
                characters.remove(sumDigits);
            }else {
                int indexNew=sumDigits%characters.size();
                output+=""+characters.get(indexNew);
                characters.remove(indexNew);
            }
        }
        System.out.println(output);
    }
}
