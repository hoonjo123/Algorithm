package step5;

import java.util.Scanner;

public class a_1152 {
    public static void main(String[] args) {
        //단어의 개수

        //" "를 기준으로 단어의 개수를 세면 좋을것같다.

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] words = S.split(" ");
        System.out.println(words.length);


    }
}
