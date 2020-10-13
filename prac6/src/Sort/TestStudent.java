package Sort;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestStudent {

    Student[] arr = new Student[5];

    public void addStudents()
    {
        arr[0] = new Student(4,2,"Mikhail", "Aleksandrovsky");
        arr[1] = new Student(5,5,"Gennadiy", "Gorin");
        arr[2] = new Student(2,4,"Vitaly", "Tsal");
        arr[3] = new Student(1,3,"Konstantin", "Melekhov");
        arr[4] = new Student(3,4,"Boris", "Boskov");
    }

    public void sortArr() {

        Student temp = new Student(0,0,"","");

        for (int i = 1; i < arr.length; i++) {
            temp.id = arr[i].getId();
            int j = i - 1;
            while ((j >= 0) && (temp.getId() < arr[j].getId())){
                arr[j+1].id = arr[j].getId();
                j--;
            }
            arr[j+1].id = temp.getId();
        }
    }

    public Student[] getArr() {
        return arr;
    }

    public void printArray(){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
