package w07ObjectsAndClassesExecise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class m01CompanyRoster {

    static class Employee {
        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;

        Employee(){

        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getSalary() {
            return salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setPosition(String position) {
            this.position = position;
        }
        public String getDepartment() {
            return department;
        }
        public void setDepartment(String department) {
            this.department = department;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }
    static class Department{
        String name;

        public void setName(String name) {
            this.name = name;
        }
        List<Employee> employees;

        public List<Employee> getEmployees() {
            return employees;
        }

        public void setEmployees(List<Employee> employees) {
            this.employees = employees;
        }

        Department(){

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i <lines ; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            employees.add(setEmployee(info));
        }

        double highestAverageSalary=0;
        String bestDepartment="";
        List<String> departmentsList = employees.stream().
                map(Employee::getDepartment).
                distinct().toList();

        for (String department : departmentsList) {
            double sum = 0.0;
            int count = 0;
            for (Employee employee : employees) {
                if (employee.getDepartment().equals(department)) {
                    sum += employee.getSalary();
                    count++;
                }
            }
            if (sum / count > highestAverageSalary) {
                highestAverageSalary = sum / count;
                bestDepartment = department;
            }
        }
        System.out.println("Highest Average Salary: " + bestDepartment);

        List<Employee> bestDepartmentEmployees=new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(bestDepartment)) {
                bestDepartmentEmployees.add(employee);
            }
        }
        Department theBestDepartment = new Department();
        theBestDepartment.setName(bestDepartment);
        theBestDepartment.setEmployees(bestDepartmentEmployees);
        theBestDepartment.getEmployees().sort(Comparator.comparing(Employee::getSalary).reversed());

        for (Employee employee : theBestDepartment.getEmployees()) {
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }
    }
    private static Employee setEmployee(String[] info) {
        Employee employeeObj=new Employee();
        employeeObj.setName(info[0]);
        employeeObj.setSalary(Double.parseDouble(info[1]));
        employeeObj.setPosition(info[2]);
        employeeObj.setDepartment(info[3]);

        if(info.length==4) {
            employeeObj.setEmail("n/a");
            employeeObj.setAge(-1);
        }
        if(info.length==5){
            if (Character.isDigit(info[4].charAt(0))) {
                employeeObj.setEmail("n/a");
                employeeObj.setAge(Integer.parseInt(info[4]));
            }else {
                employeeObj.setEmail(info[4]);
                employeeObj.setAge(-1);
            }
        }
        if (info.length==6){
            employeeObj.setEmail(info[4]);
            employeeObj.setAge(Integer.parseInt(info[5]));
        }
        return employeeObj;
    }
}
