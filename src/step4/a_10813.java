package step4;

import java.util.Scanner;

public class a_10813 {
    public static void main(String[] args) {
        //공 바꾸기

        //n개의 바구니
        //1번부터 n까지 번호, 각 바구니에 한개씩 들어가있음

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc. nextInt();

        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {

            basket[i] = i+1;
        }

        for (int k = 0; k < M; k++) {

            int i = sc.nextInt() -1;
            int j = sc.nextInt() -1;

            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }

    }
}
