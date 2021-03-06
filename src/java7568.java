import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class java7568 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[N][2];

        String[] sp;
        for (int i = 0; i < N; i++) {
            sp = bf.readLine().split(" ");  //공백기준 문자열분리
            arr[i][0] = Integer.parseInt(sp[0]); // [i][0] 몸무게
            arr[i][1] = Integer.parseInt(sp[1]); // [i][1] 키
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                    if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                        rank++;
                    }


            }
            System.out.print(rank + " ");
        }

    }
}