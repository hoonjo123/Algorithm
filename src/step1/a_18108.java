package step1;

import java.util.Scanner;

public class a_18108 {
    public static void main(String[] args) {
        //1998년생인 내가 태국에서는 2541년생?!
        //543만큼 차이가 나는데..

        Scanner sc = new Scanner(System.in);
        int tai = sc.nextInt();
        int real = tai - 543;

        System.out.println(real);

        sc.close();
    }
}
