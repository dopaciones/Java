import java.util.Scanner;

public class PreAssignedSum_4 {

    public static int preas_rec(int s, int k, int num, int result){
        if (num == (int)Math.pow(10,k)){
            return result;
        } else {
            if (sum(num) == s){
                result++;
            }
        }
        return preas_rec(s,k,num+1, result);
    }

    public static int sum(int num){

        if (num < 10){
            return num;
        }
        return num % 10 + sum(num / 10);
    }

    public static void main(String[] args) {

        System.out.print("Введите сумму s: ");
        Scanner sc1 = new Scanner(System.in);
        int s = sc1.nextInt();
        System.out.print("Введите число знаков k: ");
        Scanner sc2 = new Scanner(System.in);
        int k = sc2.nextInt();
        int num = (int)Math.pow(10,k-1);
        int result = 0;

        System.out.println("Количество чисел: "+preas_rec(s,k,num,result));
    }
}
