package greedy;

import java.util.Scanner;

public class a_10162 {
    public static void main(String[] args) {
        //전자레인지
        //A = 5분 B = 1분 C = 10초
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int A = 300;
        int B = 60;
        int C = 10;

        int countA = 0;
        int countB = 0;
        int countC = 0;

        if ( T % 10 != 0){
            System.out.println(-1);
        }else{
            countA = T/A;
            T %= A;

            countB = T/B;
            T %= B;

            countC = T/C;
            T %= C;

            System.out.println(countA + " " + countB + " " + countC);
        }
        sc.close();
    }
}
