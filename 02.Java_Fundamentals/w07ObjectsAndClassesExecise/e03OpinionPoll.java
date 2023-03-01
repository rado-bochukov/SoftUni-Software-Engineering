package w07ObjectsAndClassesExecise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e03OpinionPoll {
    static class Person{
        String name;
        int age;


        Person(String name, int age){

            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }
        public void  printInfo(){

            System.out.printf("%s - %d%n",this.name,this.age);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        List<Person> people=new ArrayList<>();

        for (int i = 0; i <lines ; i++) {

            String[]line=scanner.nextLine().split("\\s+");

            String name=line[0];
            int age=Integer.parseInt(line[1]);

            people.add(new Person(name,age));

        }

        for (Person person : people) {
            if (person.getAge()>30) {
                person.printInfo();
            }

        }


    }
}
