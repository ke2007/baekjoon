import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java14490 {
    public static void main(String[] args)throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(":");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int gcd = GCD(Math.max(N,M), Math.min(N, M));
        bf.close();

        System.out.println(N/gcd + ":"+M/gcd);
    }

    private static int GCD(int N, int M) {
        if (M == 0) {
            return N;
        }
        return GCD(M,N%M);
    }
}

