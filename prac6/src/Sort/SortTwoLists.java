package Sort;

public class SortTwoLists {

    Student[] arr = new Student[10];

    public Student[] getArr() {
        return arr;
    }

    public void printArray(){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    void merge(int[] array, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // создаем временные подмассивы
        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];
    }

    public static void mergeSort(Student[] arr, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }


}
