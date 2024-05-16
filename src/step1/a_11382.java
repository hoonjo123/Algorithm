package step1;

import java.util.Scanner;

public class a_11382 {
    public static void main(String[] args) {
        //꼬마 손정민

        //꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

        Scanner sc = new Scanner(System.in);

        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();

        long sum = A + B + C;

        System.out.println(sum);

        sc.close();
    }
}
