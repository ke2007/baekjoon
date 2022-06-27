import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class java10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int count = 0;

        String[] Stack = new String[n];


        for (int i = 0; i < n; i++) {

            String[] isOrder = bf.readLine().split(" ");

            if (isOrder[0].equals("push")) {

                Stack[count] = isOrder[1];
                count++;
            }

            if (isOrder[0].equals("pop")) {
                if (count == 0) {
                    System.out.println("-1");
                    Stack[count] = null;
                } else {
                    System.out.println(Stack[count - 1]);
                    Stack[count - 1] = null;
                    count--;
                }
            }

            if (isOrder[0].equals("top")) {
                if (count == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(Stack[count - 1]);
                }
            }

            if (isOrder[0].equals("size")) {

                System.out.println(count);

            }

            if (isOrder[0].equals("empty")) {
                if (Stack[0] == null) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }


        }


    }
}
