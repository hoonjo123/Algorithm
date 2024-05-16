package step3;

import java.util.Scanner;

public class a_10950 {
    public static void main(String[] args) {
        //A+B -3
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T ; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}
