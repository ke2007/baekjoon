import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java2884 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int H = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        bf.close();

        int rH,rm;
        int rh = H;
        rm = M - 45;
        if (rm > 60){
            rm = rm - 60;
            rh = H -1;
            if(rh ==0){
                rh = 23;
            }
        }
        System.out.print(rh+" ");
        System.out.println(rm);
    }
}
