package step5;

import java.util.Scanner;

public class a_9086 {
    public static void main(String[] args) {
        //문자열

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String S = sc.nextLine();
            System.out.println(S.charAt(0)+""+S.charAt(S.length() -1 ));
        }
    }
}
