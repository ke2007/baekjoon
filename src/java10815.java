import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class java10815 {
    private static long[] arr;
    static int n;

    public static void main(String[] args) throws NumberFormatException, IOException {
        StringBuilder st = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        arr = new long[n];
        StringTokenizer sb = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sb.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(bf.readLine());
        long[] num = new long[m];
        sb = new StringTokenizer(bf.readLine());
        for (int j = 0; j < m; j++) {
            long checkNum = Long.parseLong(sb.nextToken());
            num[j] = searchNum(checkNum);
            st.append(num[j]).append(" ");
        }
        System.out.println(st);
    }

    public static long searchNum(long num) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == num) {
                return 1;
            }
            if (arr[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
