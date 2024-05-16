package step2;

import java.util.Scanner;

public class a_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int H = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int totalMinutes = H * 60 + M + C;

//        int finalHour = (totalMinutes/24);
        int finalHour = (totalMinutes / 60) % 24;
        int finalMinute = totalMinutes % 60;

        System.out.println(finalHour + " " + finalMinute);

        sc.close();
    }
}
