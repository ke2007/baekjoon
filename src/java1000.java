import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class java1000 {
    public static void main(String[] args) throws IOException {

        BufferedReader sc2 = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = sc2.readLine().split(" ");
        int a,b;
        a = Integer.parseInt(strs[0]);
        b = Integer.parseInt(strs[1]);
        System.out.println(a+b);

    }
}
