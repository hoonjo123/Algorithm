package step3;

import java.util.Scanner;

public class a_25304 {
    public static void main(String[] args) {
        //영수증

        //준원이가 코스트코를 처음 가봣데~ 근데 너무 비싸게 나왔데
        //물건의 가격과 개수
        //물건들의 총 금액
        //물건들의 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사하는 프로그램만들기.

        //첫줄 총금액 X
        //영수증에 적힌 물건의 종류의 수 'N'
        // 각 물건의 가격a와 개수 b

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int N = sc.nextInt();

        int total = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            total += a*b;
        }

        if(total == X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
