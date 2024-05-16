package step2;

import java.util.Scanner;

public class a_2753 {
    public static void main(String[] args) {
        //윤년
        //파이썬은 정말 간단한데...

        //윤년 = 4의 배수이면서, 100의 배수가 아니고 400의 배수일때 ㅋㅋ
        //윤년이면 1 아니면 0 ..

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        if ((A%4 == 0 && A%100 != 0 ) || (A%400 == 0)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        sc.close();
    }
}
