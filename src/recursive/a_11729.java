package recursive;

import java.util.Scanner;

public class a_11729 {
    static int moveCount = 0;
    public static void main(String[] args) {
        //하노이 탑 이동 순서
        //재귀함수

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuilder result = new StringBuilder();
        hanoi(n, 1, 3, 2, result);

        System.out.println(moveCount);
        System.out.println(result.toString());
    }

    private static void hanoi(int n, int from, int to, int aux, StringBuilder result) {
        if (n == 1) {
            moveCount++;
            result.append(from).append(" ").append(to).append("\n");
            return;
        }
        hanoi(n - 1, from, aux, to, result);
        moveCount++;
        result.append(from).append(" ").append(to).append("\n");
        hanoi(n - 1, aux, to, from, result);
    }
}
