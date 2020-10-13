package Sort;

public class SortByGPA {
    Student[] arr = new Student[5];


    public void addStudents()
    {

        arr[0] = new Student(9, 5, "Viktoria", "Alekseeva");
        arr[1] = new Student(6, 3, "Angelina", "Birulknia");
        arr[2] = new Student(7, 5, "Ekaterina", "Kolevina");
        arr[3] = new Student(10, 4, "Aleksandra", "Alekseeva");
        arr[4] = new Student(8, 3, "Yulia", "Lolova");
    }

    public void sortArr() {

        Student temp = new Student(0, 0, "", "");
        boolean sort = false;

        while (!sort){
            sort = true;
            for (int i = 0; i < arr.length - 1; i++){
                if (arr[i].getMark() < arr[i+1].getMark()){
                    sort = false;
                    temp.mark = arr[i].getMark();
                    arr[i].mark = arr[i+1].getMark();
                    arr[i+1].mark = temp.getMark();
                }
            }
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
