
import java.io.*;

public class java1003 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[][] dp = new int[41][2];

        dp[0][0] = 1;
        dp[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }


        for (int j = 0; j < N; j++) {
            int M = Integer.parseInt(br.readLine());
            sb.append(dp[M][0]).append(" ").append(dp[M][1]).append("\n");
        }
        System.out.println(sb);
    }
}
