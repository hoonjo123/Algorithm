package step6;

import java.util.Scanner;

public class a_10988 {
    public static void main(String[] args) {
        //팰린드롬
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        if(palindrome(word)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    public static boolean palindrome(String word){
        int left = 0;
        int right = word.length() -1;
        //level
        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
