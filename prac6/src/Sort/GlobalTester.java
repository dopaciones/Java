package Sort;

import java.util.Arrays;
import java.util.stream.Stream;

public class GlobalTester {
    public static void main(String[] args) {


        System.out.println("Упражнение 1");
        TestStudent boys = new TestStudent();
        boys.addStudents();
        boys.printArray();
        boys.sortArr();
        boys.printArray();

        System.out.println("Упражнение 2");
        SortByGPA girls = new SortByGPA();
        girls.addStudents();
        girls.printArray();
        girls.sortArr();
        girls.printArray();

        System.out.println("Упражнение 3");





    }
}
