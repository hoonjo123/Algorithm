package step5;

import java.util.Scanner;

public class a_10809 {
    public static void main(String[] args) {
        //알파벳 찾기
        //무슨말인지 잘 모르겠음
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int[] alphabet = new int[26];
        //알파벳의 갯수는 총 26개이다.
        for (int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int index = c - 'a';
            if(alphabet[index] == -1){
                alphabet[index] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
