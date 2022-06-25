import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class java커트라인 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int cutt;

        String[] N = bf.readLine().split(" ");


        int k = Integer.parseInt(N[1]);
        int ij = Integer.parseInt(N[0]);


        String [] X = bf.readLine().split(" ");

        int[] N2 = new int[Integer.parseInt(String.valueOf(X.length))];

        for (int t = 0; t < ij; t++) {
            N2[t] = Integer.parseInt(X[t]);
        }


        for (int i = 0; i < N2.length; i++) {
            for (int j = i + 1; j < N2.length; j++) {
                if(N2[i] < N2[j]){
                    int temp = N2[i];
                    N2[i] = N2[j];
                    N2[j] = temp;
                }
            }
        }
        cutt = N2[k-1];

        System.out.println(Arrays.toString(N2));
        System.out.println(cutt);

    }
}
