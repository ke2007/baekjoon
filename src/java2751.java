import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class java2751 {
    public static void main(String[] args)throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }
        Collections.sort(list);

        for (int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
//        int[] X = new int[N];
//
//        for (int i = 0; i < N; i++) {                         | 시간초과
//             X[i] =Integer.parseInt(bf.readLine());           |
//        }                                                     |
//                                                              |
//        for (int i = 0; i < X.length; i++) {
//            for (int j = i + 1; j < X.length; j++) {
//                if (X[i] > X[j]) { //오름차순
//                    int temp = X[i]; //저장 값
//                    X[i] = X[j];
//                    X[j] = temp;
//                }
//            }
//            System.out.println(X[i]);
//        }
//
//            =============================Collections.sort=============================

    }
}
