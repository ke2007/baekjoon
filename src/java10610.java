import java.io.*;

public class java10610 {
    public static final int MAX = 100000;
    public static String N;
    public static int[] numCountArr;
    public static long strlen;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        N = bf.readLine();
        strlen = N.length();
        numCountArr = new int[10];
        long total = 0;

        for (int i = 0; i < strlen; i++) {
            int tNum = Integer.parseInt(N.substring(i, i + 1));
            numCountArr[tNum] += 1;
            total += tNum;
        }
        if (!N.contains("0") || total % 3 != 0) {
            System.out.print("-1");
        } else {
            for (int i = 9; i >= 0; i--) {
                while (numCountArr[i] > 0) {
                    sb.append(i);
                    numCountArr[i]--;
                }
            }
            System.out.print(sb.toString());
        }
    }
}
