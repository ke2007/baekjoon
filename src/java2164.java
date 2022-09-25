import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class java2164 {
    public static void main(String[] args)throws IOException {

        Queue<Integer> result = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i<=N; i++) { //N만큼 Queue 에 값을 집어넣음
            result.add(i);
        }
//      queue 상황 : front   1 2 3 4  rear
        for (int i = 0; i < N-1; i++) { //마지막값은 따로 빼줘야하기 때문에 N-1까지 반복
            result.poll();   // 1이 나감
            for (int j = 0; j < 1; j++) { // 뒤로보내주는 처리는 한 번 반복해야 하기때문에 한 번만 반복함
                result.add(result.poll()); // 2가 뒤로감
            }

        }
        System.out.println(result.poll()); //Queue 에 마지막으로 남은 값 출력
    }
}
