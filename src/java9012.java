import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class java9012 {

    static StringBuilder sb = new StringBuilder();
    static Stack<Character> result;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st =new StringTokenizer(br.readLine());
            result = new Stack<>();
            solve(st.nextToken());
        }
        System.out.println(sb);
    }
    public static void solve(String s){

        for (int i = 0; i < s.length(); i++){               //문자열 길이만큼 반복

            char c = s.charAt(i);                           //charAt()으로 한글자씩 잘라서 판단

            if (c == '('){                                  // '(' 을 받으면 스택에 push

                    result.push(c);
            }
            else {                                          // ')'을 받았을때 스택이 비어있다면 조건에 충족하지 않으므로
                if (result.empty()) {

                    sb.append("NO").append("\n");           //"NO" 출력
                    return ;
                }
                else {
                    result.pop();                           // ')'을 받았다면 한쌍이 맞춰졌으므로 '(' 을 stack 에서 pop 한다
                }
            }
        }
        if (result.empty()) {

            sb.append("YES").append('\n');
        }
        else {
            sb.append("NO").append('\n');
        }
    }
}


