package step4;

import java.util.Scanner;

public class a_10811 {
    public static void main(String[] args) {
        //바구니 뒤집기
        //리스트 역순으로 변경하는 작업 반복
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int k = 0; k < M; k++) {
            int i = sc.nextInt() -1 ;
            int j = sc.nextInt() -1;

            while(i < j){
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
