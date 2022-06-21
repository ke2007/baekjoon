import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java2884 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer( bf.readLine() );

        int H= Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        bf.close();
        if(0<=H &&H<=23&&0<=M&&M<=59){
        int rm;
        int rh = H;
        rm = (M - 45);
        if (rm<0){
            rm = rm + 60;
            if(rm ==60){
                rm =0;
            }
            rh = H - 1;
            if(rh == -1){
                rh = 23;
            }
        }
        System.out.print(rh+" ");
        System.out.println(rm);
    }
    }
}
