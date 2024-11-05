package company;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> skills = Arrays.asList("Circuit Design", "Programming", "Project Management");

        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        Director khaled = new Director("Khaled", "Film", 30000, 1000);
        Engineer wahab = new Engineer("Wahab", "Electrical Engineer", 1000, skills);
        SalesPerson yousef = new SalesPerson("Yousef", "Sales", 100, 1000);


        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(wahab);
        System.out.println(khaled);
        System.out.println(yousef);


    }
}