package step3;

import java.util.Scanner;

public class a_2739 {
    public static void main(String[] args) {
        //구구단
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + ( N * i));
        }
        sc.close();
    }
}
