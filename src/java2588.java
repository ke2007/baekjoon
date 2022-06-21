import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class java2588 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        int b= Integer.parseInt(bf.readLine());
        bf.close();

        int r = a * ((b%100)%10);
        int r2 = a * ((b / 10) % 10);
        int r3 = a * ((b / 100));
        int r4 = a *b;
        System.out.println(r+"\n"+r2+"\n"+r3+"\n"+r4);
        
    }
}
