package step6;

import java.util.Scanner;

public class a_25206 {
    public static void main(String[] args) {
        //너의 평점은

        //전공평점 출력하는 문제
        //전공평점 : 전공과목별(학점 * 과목평점)의 합을 학점의 총합으로 나눈값

        Scanner sc = new Scanner(System.in);
        String[] grades = new String[20];
        double[] credits = new double[20];
        double totalpoints = 0.0;
        double totalcredits = 0.0;

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double credit = sc.nextDouble(); //학점
            String grade = sc.next();

            double gradepoint = GradePoint(grade);
            if(gradepoint >= 0 ){
                totalpoints += credit * gradepoint;
                totalcredits += credit;
            }
        }

        double grade1 = totalpoints/totalcredits;
        System.out.printf("%.4f\n",grade1);
    }

    private static double GradePoint(String grade){
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            case "P":
                return -1.0; // P는 계산에서 제외
            default:
                throw new IllegalArgumentException("x:" + grade);
        }
    }
}
