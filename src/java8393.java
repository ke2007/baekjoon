import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java8393 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int m = 0;
        bf.close();
        for (int i = 0; i <= n; i++) {
            m +=i ;
        }
        System.out.println(m);
    }
}
