import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class java10814 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        //N개의 줄에 나이순, 나이가 같다면 입력순

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];
        StringTokenizer st ;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = st.nextToken(); //나이
            arr[i][1] = st.nextToken(); //이름

        }
        Arrays.sort(arr, Comparator.comparingInt(e -> Integer.parseInt(e[0]))
        );

        int i=0;
        for (String[] ar :arr) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
            i++;
        }

        System.out.println(sb);

    }
}
