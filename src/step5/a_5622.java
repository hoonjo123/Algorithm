package step5;

import java.util.Scanner;

public class a_5622 {
    public static void main(String[] args) {
        //다이얼

        //상근이 할머니 다이얼전화기
        //숫자 1을 걸려면 총 2초 필요
        //한칸 옆에 숫자는 1초씩 더 걸림
        //할머니가 전화 걸기위해 필요한 최소시간 구하시오

        //2:abc....
        //시간 +1...

        Scanner sc = new Scanner(System.in);
        int atLeastTime = 0;
        String alphabet = sc.next();

        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            if(c >= 'A'&& c <= 'C'){
                atLeastTime += 3;
            } else if (c >= 'D' && c <= 'F'){
                atLeastTime += 4;
            } else if ( c >= 'G' && c <= 'I'){
                atLeastTime += 5;
            } else if ( c >= 'J' && c <= 'L' ){
                atLeastTime += 6;
            } else if ( c >= 'M' && c <= 'O'){
                atLeastTime += 7;
            } else if (c >= 'P' && c <= 'S') {
                atLeastTime += 8; // 7 + 1
            } else if (c >= 'T' && c <= 'V') {
                atLeastTime += 9; // 8 + 1
            } else if (c >= 'W' && c <= 'Z') {
                atLeastTime += 10; // 9 + 1
            }
        }
        System.out.println(atLeastTime);
    }
}
