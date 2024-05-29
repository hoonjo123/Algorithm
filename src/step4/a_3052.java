package step4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class a_3052 {
    public static void main(String[] args) {
        //나머지
        //수 10개를 입력받기, 이를 42로 나눈 나머지를 구하고
        //for문을 써서 각각의 수가 다른지 확인해보기.

        Scanner sc = new Scanner(System.in);

        Set<Integer> namojis = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int namoji = num % 42;
            namojis.add(namoji);
        }
        System.out.println(namojis.size());
    }
}
