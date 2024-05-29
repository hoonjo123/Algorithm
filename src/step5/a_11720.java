package step5;

import java.util.Scanner;

public class a_11720 {
    public static void main(String[] args) {
        //숫자의 합
        //N개의 숫자를 입력받고 모두 합해서 출력하는 거

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String Num  = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += Character.getNumericValue(Num.charAt(i));
        }
        System.out.println(sum);
    }
}
