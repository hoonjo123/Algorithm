package step6;

import java.util.Scanner;

public class a_3003 {
    public static void main(String[] args) {
        //킹, 퀸, 룩, 비숍, 나이트, 폰

        Scanner sc = new Scanner(System.in);
        int[] set = {1,1,2,2,2,8};

        int[] existPieces = new int[6];
        for (int i = 0; i < 6; i++) {
            existPieces[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            int dif = set[i] - existPieces[i];
            System.out.print(dif + " ");
        }
    }
}
