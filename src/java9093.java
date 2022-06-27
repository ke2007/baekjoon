
import java.io.*;
import java.util.Stack;

public class java9093 {
    public static void main(String[] args)throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < N; i++) {

            String str = bf.readLine()+"\n";

            for (char ch : str.toCharArray()) {
                if (ch == ' '|| ch =='\n'){
                    while (!stack.empty()){
                        bw.write(stack.pop());
                    }
                    bw.write(" ");
                }else {
                    stack.push(ch);
                }
            }
            bw.write('\n');
            bw.flush();
        }
        bf.close();


    }
}
