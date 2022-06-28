import java.io.*;

public class java11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        for (int i = 2; i <= Math.sqrt(N); i++) {

            while (N % i == 0) {
                sb.append(i).append('\n');
                N/=i;
            }
        }
        if (N != 1) {
            sb.append(N);
        }
        System.out.println(sb);
    }
}
