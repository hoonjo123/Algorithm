package step6;

import java.util.Scanner;

public class a_2941 {
    public static void main(String[] args) {
        //크로아티아 알파벳
        Scanner sc = new Scanner(System.in);
        String str[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String st = sc.next();
        for (int i = 0; i < str.length; i++) {
            if (st.contains(str[i]))
                st = st.replace(str[i], "!");
        }
            System.out.println(st.length());
        }
    }

