package recursive;

import java.util.Scanner;

public class a_27433 {
    public static void main(String[] args) {
        //팩토리얼2

        //N!를 출력하는 프로그램
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }
    private static long factorial(int n){
        if( n == 0){
            return 1;
        }else {
            return n * factorial(n - 1);
        }
        //n이 0이면 1을 받아서 재귀호출이 끝남. 5라고 입력받으면 5 * 4 * 3 * 2 * 1
    }
}
