package step6;

import java.util.Scanner;

public class a_1157 {
    public static void main(String[] args) {
        //단어 공부
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String word = input.toUpperCase();

        int[] frequency = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            //아스키코드
            //A는 65, B는 66..
            //ch가 B라고 한다면 'ch-A는 1
            //만약 C라면 2 (67-65)
            frequency[a - 'A']++;
        }

        int max = 0;
        char mostChar = '?';
        boolean b = false;

        for (int i = 0; i < 26; i++) {
            if(frequency[i] > max){
                max = frequency[i];
                mostChar = (char)(i + 'A');
                b = false;
            }else if(frequency[i] == max){
                b = true;
            }
        }
        if(b){
            System.out.println("?");
        }else{
            System.out.println(mostChar);
        }
    }
}
