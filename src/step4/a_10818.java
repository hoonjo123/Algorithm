package step4;

import java.util.Scanner;

public class a_10818 {
    public static void main(String[] args) {
        //최소, 최대

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //왜 min이 max이고 max가 min이지?

        for (int i = 0; i < N; i++) {
            int numbers = sc.nextInt();
            if(numbers < min){
                min = numbers;
            }
            if(numbers > max){
                max = numbers;
            }
        }
        System.out.println(min + " " + max);
    }
}
