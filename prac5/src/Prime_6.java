import java.util.Scanner;

public class Prime_6 {

    public static boolean prime_rec(int a, int i){

        if ((a == 1)||(a == 2)){
            return true;
        } else if ((a % i == 0)){
            return false;
        } else if (i < a / 2) {
            return prime_rec(a, i+1);
        } else {
            return true;
        }

    }

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc1.nextInt();
        int i = 2;

        if (prime_rec(a,i)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
