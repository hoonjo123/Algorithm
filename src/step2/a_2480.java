package step2;

import java.util.Scanner;

public class a_2480 {
    //주사위 세개
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int p = 0;

        if( a == b && b == c){
            p = 10000 + (a*1000);
        }else if( a == b || a == c){
            p = 1000 + (a*100);
        }else if( b == c){
            p = 1000 + (b*100);
        }else{
            //모두 다를 경우 가장 큰 눈이 나올경우 max
            p = Math.max(a, Math.max(b, c))*100;
        }

        System.out.println(p);

        sc.close();
    }
}
