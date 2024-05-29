package step4;

import java.util.Scanner;

public class a_1546 {
    public static void main(String[] args) {
        //평균
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] score = new double[N];
        double maxScore = 0;

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            if(score[i] > maxScore){
                maxScore = score[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            score[i] = (score[i] / maxScore) * 100;
            sum += score[i];
        }

        double avg = sum/N;

        //소수점 두자리수까지!!!!!
        System.out.printf("%.2f" + avg);
    }
}
