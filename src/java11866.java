import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class java11866 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i = 1; i<=N; i++){
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        while ((q.size()>1)){  //마지막 남은 한명 처리를 위해 남은 인원수가 1보다 클 떄까지 반복

            for (int i = 0; i < K-1; i++) { //K번째 사람을 poll 해야하므로 k-1까지 반복
                q.offer(q.poll()); // 해당되지않는 사람은 뒤로 다시 들어감 (원형큐 )poll -> offer
            }
            sb.append(q.poll()).append(", "); //반복문이 끝났다 = K번째 사람이다 = poll 함.
        } //반복

        sb.append(q.poll()).append('>'); // 이 시점에서 큐에 남아있는 마지막 한 사람을 poll 하고 '>' 를 붙여줌
        System.out.print(sb); // sb 출력

    }
}
