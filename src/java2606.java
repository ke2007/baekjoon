import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java2606 {
    static int cnt;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int computer = Integer.parseInt(br.readLine());
        int netWork = Integer.parseInt(br.readLine());

        int[][] graph = new int[computer + 1][computer + 1]; //입력한 정점 그대로 쓰기위해 +1 해준다
        boolean[] isInfection = new boolean[netWork+1];

        for (int i = 0; i < netWork; i++) {             //인접행렬 채우기
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        dfs(graph,isInfection,1);
        System.out.println(cnt-1);
    }
    /*
    * 매개변수 3개를 받는 dfs 메서드
    * @param int[][] graph : 인접행렬 배열
    * @param boolean[] isInfection : 감염여부 체크 배열
    * @param int start : 시작하는 컴퓨터
    * 모든 컴퓨터검사가끝나면 return;(재귀종료)
    */
    public static void dfs(int[][] graph, boolean[] isInfection, int start){

        if(isInfection[start]) return;

        isInfection[start] = true;
        cnt++;
        for(int i = 0; i < graph[start].length; i++){

            if(graph[start][i] == 1 && !isInfection[i]){ //컴퓨터끼리 연결되어 있고, 아직 방문하지 않았을때

                dfs(graph,isInfection,i);
            }
        }
    }
}
