package step4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class a_5597 {
    public static void main(String[] args) {
        //과제 안 내신 분..?
        Scanner sc = new Scanner(System.in);

        int students = 30;

        Set<Integer> submittedStudent = new HashSet<>();

        for (int i = 0; i < 28; i++) {
            int n = sc.nextInt();
            submittedStudent.add(n);
        }
        for (int i = 1; i <= students; i++) {
            if(!submittedStudent.contains(i)){
                System.out.println(i);
            }
        }
    }
}
