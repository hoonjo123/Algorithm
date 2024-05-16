package step1;

import java.util.Scanner;

public class a_2588 {
    public static void main(String[] args) {
        //곱셈

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int d1 = B%10;
        int d2 = (B/10)%10;
        int d3 = B/100;

        int r1 = A*d1;
        int r2 = A*d2;
        int r3 = A*d3;

        int fr = A*B;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(fr);

        sc.close();

    }
}
