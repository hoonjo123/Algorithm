package step4;

import java.util.Scanner;

public class a_2562 {
    public static void main(String[] args) {
        //최댓값
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 1; i <= 9; i++) {
            int num = sc.nextInt();
            if(num > max){
                max = num;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
