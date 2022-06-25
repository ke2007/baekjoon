import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java영수증 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(bf.readLine()); //총금액
        int N = Integer.parseInt(bf.readLine()); // 물건종류 수 입력받기
        int sum=0;
        int sum2 = 0;

        for (int i = 0; i < N; i++) {

            String[] M = bf.readLine().split(" "); //물건 가격과 갯수 공백구분

            for (int j = 0; j < 1; j++) {

            sum2 = Integer.parseInt(M[0])*Integer.parseInt(M[1]);

            System.out.println(sum2);
            }
            sum +=sum2;

            System.out.println(sum);


        }
        if (sum == X){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
