//1920 수 찾기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class java1920 {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //첫째줄에 N개의 정수 를 입력받기 위한 N값 입력
        ArrayList<Integer> input = new ArrayList<>(); // 최초 입력받은배열

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < N; i++) {
            input.add(Integer.parseInt(st.nextToken())); // N개의 정수를 입력
        }

        int M = Integer.parseInt(br.readLine()); // M 개의 정수를 입력받기위한 M입력
        ArrayList<Integer> result = new ArrayList<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < M; i++) {
            result.add(Integer.parseInt(st2.nextToken())); // M개의 정수를 입력받음
        }

        //처음 구현했을땐 이중 for문과 Contains를 사용해서 구현했으나 시간초과가 나서 이진탐색으로 해결하기로함.

        Collections.sort(input); // 이진탐색을 할땐 정렬이 되어 있어야함

        for (Integer resultValue : result) { //result의 모든 원소에 대해
            if(Collections.binarySearch(input,resultValue) >= 0){ //input 배열( *최초 입력받은배열)을 resultValue 를 key 값 으로 탐색

                // Collections.binarySearch() 는 값이 없을시에 key (값보다 큰 최초의 값 * -1) -1   의 위치를 리턴해준다 .(음수가 나온다)

                System.out.println("1");
            }else { //이진탐색 결과가 음수일경우 == 존재하지않을경우 "0" 출력
                System.out.println("0");
            }
        }


    }
}
