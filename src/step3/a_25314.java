package step3;

import java.util.Scanner;

public class a_25314 {
    //코딩은 체육과목입니다?
    public static void main(String[] args) {
        //int 는 4바이트
        //long int 는 4바이트
        // long long int 는 8바이트
        // long 추가될때마다 4바이트 추가쓰

        Scanner sc = new Scanner(System.in);

        //N바이트 입력받는다. 16바이트이고 long이 추가될때마다 4가 추가됨
        int N = sc.nextInt();

        int LongNumber = N/4;
        StringBuilder r = new StringBuilder();
        //append, insert, delete, replace, reverse, tostring등이 있다.
        //문자열을 수정하기 위해 stringbuilder사용

        //4바이트씩 늘어나는거니까 4로 나눠주면 될듯?...

        for (int i = 0; i < LongNumber; i++) {
            r.append("long");
        }
        r.append("int");

        System.out.println(r.toString());
        sc.close();
    }
}
