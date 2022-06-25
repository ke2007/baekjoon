import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java1789 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n =0;
        long N = Long.parseLong(bf.readLine());
        int count=0;
        bf.close();
        for (int i = 1; ; i++) {
            if(n>N)break;
            n += i;
            count++;



        }

        System.out.println(count-1);

    }
}
