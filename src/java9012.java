import com.sun.source.doctree.SeeTree;

import java.io.*;
import java.util.Stack;

public class java9012 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }
        System.out.println(sb);

    }
    public static String solve(String s){
        Stack<Character> at = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                at.push(c);
            } else if (at.empty()) {
                return "NO";
            } else {
                at.pop();
            }
        }
        if (at.empty()) {
            return "YES";
        } else {
            return "NO";
        }

    }
}
