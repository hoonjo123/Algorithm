package step5;

import java.util.Scanner;

public class a_2908 {
    public static void main(String[] args) {
        //상수

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int reverse1 = reverseNumber(A);
        int reverse2 = reverseNumber(B);

        System.out.println(Math.max(reverse1,reverse2));
    }

    public static int reverseNumber(int num){
        int reversed = 0;
        while(num > 0){
            reversed = reversed *10 + num %10;
            num = num / 10;
        }
        return reversed;
    }
}
