package step5;

import java.util.Scanner;

public class a_27866 {
    public static void main(String[] args) {
        //문자와 문자열
        //단어S, 정수i
        //S의 i번째 문자를 출력

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();
        System.out.println(S.charAt(i - 1));
    }
}
