package contest;

import java.util.Scanner;

public class a_31945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        // 정육면체의 꼭짓점을 배열로 정의합니다.
        int[][] points = {
                {0, 0, 0}, {0, 0, 1}, {0, 1, 0}, {0, 1, 1},
                {1, 0, 0}, {1, 0, 1}, {1, 1, 0}, {1, 1, 1}
        };

        // 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            // 입력받은 네 점의 좌표를 가져옵니다.
            int[] pa = points[a];
            int[] pb = points[b];
            int[] pc = points[c];
            int[] pd = points[d];

            // 네 점이 한 면 위에 있는지 확인
            if (isSameFace(pa, pb, pc, pd)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

        scanner.close();
    }

    // 네 점이 같은 평면에 있는지 확인하는 함수
    private static boolean isSameFace(int[] pa, int[] pb, int[] pc, int[] pd) {
        // x, y, z 축의 값의 합을 계산
        int sumA = pa[0] + pa[1] + pa[2];
        int sumB = pb[0] + pb[1] + pb[2];
        int sumC = pc[0] + pc[1] + pc[2];
        int sumD = pd[0] + pd[1] + pd[2];

        // 네 점의 좌표 값이 같은 평면에 있는지를 확인
        // 한 평면에 있는 경우에는 x, y, z 값의 합이 같거나,
        // 혹은 두 점은 합이 같고 나머지 두 점의 합이 같은 경우
        return (sumA == sumB && sumB == sumC && sumC == sumD) ||
                (sumA == sumB && sumC == sumD) ||
                (sumA == sumC && sumB == sumD) ||
                (sumA == sumD && sumB == sumC);
    }
}
