import java.util.Scanner;

public class Sum_5 {

    public static int sum_rec(int num){

        if (num < 10){
            return num;
        }
        return num % 10 + sum_rec(num / 10);
    }

    public static void main(String[] args) {

        System.out.print("Введите число: ");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();

        if (num < 0){
            System.out.println("Incorrect input");
        } else {
            System.out.println("Сумма цифр числа = " + sum_rec(num));
        }
    }
}
