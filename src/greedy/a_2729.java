package greedy;

import java.util.Scanner;

public class a_2729 {
    public static void main(String[] args) {
        //세탁소 사장 동혁
        //동혁이가 리암 채용
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            change(C);
        }
    }

    static void change(int cents){
        int quarters = cents/25;
        cents %= 25;
        int dimes = cents/10;
        cents %= 10;
        int nickels = cents/5;
        cents %= 5;
        int pennies = cents;

        System.out.println(quarters + " " + dimes + " " + nickels + " " + cents);
    }
}
