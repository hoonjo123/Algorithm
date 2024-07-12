package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class a1931 {
    public static void main(String[] args) {
        //회의실 배정

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //회의의 수 입력받기

        //회의의 정보를 저장할 2차원 배열 만들기!

        int[][] meetings = new int[n][2];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt(); //시작시간
            meetings[i][1] = sc.nextInt(); //종료시간
        }

        //정렬시키기(람다함수 이용)
        Arrays.sort(meetings, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            }
            return Integer.compare(o1[1], o2[1]);
        });

        int count = 0; //회의의 최대 개수 초기화
        int finishedTime = 0; // 회의의 종료시간

        for (int i = 0; i < n; i++) {
            if(meetings[i][0] >= finishedTime){
                finishedTime = meetings[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
