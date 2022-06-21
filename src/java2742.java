import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class java2742 {
    public static void main(String[] args)throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int m = N;
//
//        for (int i =0; i < N; i++){
//            System.out.println(m);
//                m = m-1;
//        }
//        sc.close();
//
        /* for문만 사용*/
//
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        in.close();
//
//        while (N > 0) {
//            System.out.println(N);
//            N--;
//
//
//        }
        /* while문 사용*/
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        bf.close();

        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            sb.append(N).append("\n");
            N--;
        }
        System.out.println(sb);
        /* BufferedReader와 Stringbuilder, append사용*/
    }
}
