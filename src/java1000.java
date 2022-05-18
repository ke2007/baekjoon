import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class java1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc2 = new BufferedReader(new InputStreamReader(System.in));

        int a,b;
        a = Integer.parseInt(sc2.readLine());
        b = Integer.parseInt(sc2.readLine());

        try {
            sc2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(a+b);

    }
}
