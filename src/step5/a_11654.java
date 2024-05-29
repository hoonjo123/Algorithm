package step5;

import java.util.Scanner;

public class a_11654 {
    public static void main(String[] args) {
        //아스키 코드

        Scanner sc = new Scanner(System.in);

        char Char = sc.next().charAt(0);

        //char 타입을 int로 변환하면 자동으로 아스키값이 나온다!
        int ascii = (int) Char;
        System.out.println(ascii);

    }
}
