import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class java1012 {

    static int[][] BCHB;
    static int result; //지렁이개수

    static int[] dirX = new int[]{0,0,-1,1};
    static int[] dirY = new int[]{-1,1,0,0};
    static int startX = 0;
    static int startY = 0;
    static int M;
    static int N;
    static int K;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력값
        int testCase = Integer.parseInt(br.readLine()); //테스트 케이스 개수

        //testcase 만큼 반복
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로길이
            N = Integer.parseInt(st.nextToken()); // 세로길이
            K = Integer.parseInt(st.nextToken()); // 배추 개수


            BCHB = new int[M][N]; //int 배열 초기값은 0
            visited = new boolean[M][N];

            result = 0;
            for (int j =0; j < K; j++) {

                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                BCHB[x][y] = 1;
            }

            //인접한 배추를 확인하기위해 isValid 에 넘겨줌.
            for (int k = 0; k < M; k++){
                for (int l = 0; l < N; l++) {
                    //1인데 방문하지 않은배열일경우
                    if (BCHB[k][l] == 1 && !visited[k][l]) {
                        isValid(k,l);
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }

    /*
    * 인접한 배추를 검사하는 메소드
    * @param startX 시작 x좌표
    * @param startY 시작 y좌표
     */
    private static void isValid(int startX, int startY) {
        visited[startX][startY] = true;

        for (int i = 0; i < 4; i++) {
            int nextX = startX + dirX[i];
            int nextY = startY + dirY[i];

            if (nextX >=0 && nextY>=0&&nextX < M && nextY <N){ //좌표 방향이 배추밭 배열을 벗어나지 않았을때.
                if(!visited[nextX][nextY] && BCHB[nextX][nextY]==1){

                    isValid(nextX,nextY);
                }
            }
        }
    }
}
