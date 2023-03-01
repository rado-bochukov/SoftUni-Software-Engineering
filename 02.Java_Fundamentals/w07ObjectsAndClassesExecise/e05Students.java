package w07ObjectsAndClassesExecise;

import java.util.*;

public class e05Students {

    static class Student{
        String firstName;
        String lastName;
        double grade;

        Student(String firstName, String lastName, double grade) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linesCount=Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < linesCount; i++) {

            String[]info=scanner.nextLine().split("\\s+");

            String firstName=info[0];
            String lastName=info[1];
            double grade=Double.parseDouble(info[2]);

            students.add(new Student(firstName,lastName,grade));
        }

        List<Student> sortedStudents=getSortedList(students);
        for (Student sortedStudent : sortedStudents) {
            System.out.printf("%s %s: %.2f%n",sortedStudent.getFirstName(),sortedStudent.getLastName(),sortedStudent.getGrade());
        }

    }

    private static List<Student> getSortedList(List<Student> students) {
        List<Student> sorted=new ArrayList<>();
        List<Student> current=students;

        current.sort(Comparator.comparing(Student::getGrade));
        for (int i = current.size()-1; i >=0 ; i--) {
            sorted.add(current.get(i));

        }

//        double minGrade=0;
//
//        while (current.size()!=0){
//            for (Student student : current) {
//                if (student.getGrade()>minGrade){
//                    minGrade= student.getGrade();
//                    sorted.add(student);
//                    current.remove(student);
//                    break;
//                }
//            }
//        }
        return sorted;
    }
}
