package step3;

import java.io.*;

public class a_15552 {
    public static void main(String[] args) throws IOException {
        //빠른 A+ B
//        buffered쓰는문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] n = br.readLine().split(" ");
            int A = Integer.parseInt(n[0]);
            int B = Integer.parseInt(n[1]);
            int s = A + B;
            bw.write(s + "\n");
        }
        bw.flush();


    }
}
