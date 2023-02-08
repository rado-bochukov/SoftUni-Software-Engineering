package w05ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class m03TakeRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        List<Integer> numbersInitial=new ArrayList<>();
        List<String> symbols=new ArrayList<>();

        for (int i = 0; i <input.length() ; i++) {

            char current=input.charAt(i);

            if(Character.isDigit(current)) {
                numbersInitial.add(Integer.parseInt(String.valueOf(current)));
            }else {
                symbols.add(String.valueOf(current));
            }
        }
        List<Integer>take=new ArrayList<>();
        List<Integer>skip=new ArrayList<>();
        for (int i = 0; i <numbersInitial.size() ; i++) {

            if(i%2==0){
                take.add(numbersInitial.get(i));
        }else {
                skip.add(numbersInitial.get(i));
            }
        }
        List<String>output=new ArrayList<>();
        List<String> resultTake=new ArrayList<>();
        List<String> updated=new ArrayList<>();


        for (int i = 0; i <take.size() ; i++) {

            if(symbols.size()<= take.get(i)){
                resultTake=symbols.subList(0,symbols.size());
                output.addAll(resultTake);
                break;
            }
            if(symbols.size()<=skip.get(i)) {
                break;
            }
            resultTake=symbols.subList(0,take.get(i));
            output.addAll(resultTake);
            updated = symbols.subList(take.get(i) , symbols.size());
            symbols=updated;
            updated = symbols.subList(skip.get(i) , symbols.size());
            symbols=updated;
        }

        for (String s : output) {
            System.out.print(s);
        }
    }
}
