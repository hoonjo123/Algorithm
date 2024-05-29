package step5;

import java.util.Scanner;

public class a_2675 {
    public static void main(String[] args) {
        //문자열 반복
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();

            StringBuilder P = new StringBuilder();
            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    P.append(c);
                }
            }
            System.out.println(P.toString());
        }
    }
}
