package step6;

import java.util.Scanner;

public class a_1316 {
    public static void main(String[] args) {
        //그룹단어 체커
        //ccazzzzbb , kin 모두 그룹단어,
        // aab..
        //한 단어에 나왔던 알파벳이 또 나오면 그룹단어가 아니다.
        //한번도 나오지 않았던 알파벳을 찾아서 출력해주면 될 것 같다.


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int groupWorld = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            if(Groupworld(word)){
                groupWorld++;
            }
        }
        System.out.println(groupWorld);
        sc.close();
    }

    private static boolean Groupworld(String word) {
        boolean[] exist = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char alphabet = word.charAt(i);
            if ( i>0 && alphabet != word.charAt(i - 1) && exist[alphabet - 'a']){
                return false;
            }
            exist[alphabet - 'a'] = true;
        }
        return true;
    }
}
