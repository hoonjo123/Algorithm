package step1;

import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
//        모험의 시작

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //무기수

        int X = scanner.nextInt(); //쇼미더머니
        int S = scanner.nextInt(); //공격력

        boolean canWin = false;

        for (int i = 0; i < N; i++) {
            int price = scanner.nextInt();
            int power = scanner.nextInt();

            if( price < X && power > S){
                canWin = true;
                break;
            }
        }
        if(canWin){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        scanner.close();
    }
}
