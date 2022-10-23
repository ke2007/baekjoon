import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class java11650 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int[][] inputArray = new int[N][2];
        StringTokenizer st;


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            inputArray[i][0] = Integer.parseInt(st.nextToken());
            inputArray[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(inputArray,(e1, e2)->{ // Comparator 에 대해 람다식을 생성할 때 compare의 T[] 타입을 가진 매개변수를 람다식으로 바꾸어 쓸 수 있다는 것
            if(e1[0] == e2[0]){
                return e1[1] -e2[1];
            }else{
                return e1[0] - e2[0];
            }
        });

        Arrays.sort(inputArray, new Comparator<int[]>() { //sort메소드는 두가지 인자를 받을수있음! 첫번째 인자는 배열(타입상관없음), 키값은 '배열의 타입'을 따라감! 여기서는 int[][] 를썼으니 키값은 int[]가 됨!
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        if (o1[0] == o2[0]) {        // 첫번째 원소가 같다 ? arr[0][0] == arr[1][0]    3(0, 0) 4(0, 1)  /  3(1,0) 3(1,1) -> 3비교 어? 같네
                            return o1[1] - o2[1];   // 두 번째 원소 비교   arr[0][1] 과 arr[1][1] 비교   3(0, 0) 4(0, 1)  /  3(1,0) 3(1,1) -> 4 와 3 비교 -> 4 - 3 은 ?  1(양수) 리턴 -> 양수값이면 나(4) 보다 작으니까 앞으로 가 ~
                        } else {
                            return o1[0] - o2[0];  //
                        }
                    }
                });


        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int[] ar : inputArray) {
            sb.append(inputArray[i][0]).append(" ").append(inputArray[i][1]).append("\n");
            i++;
        }
        System.out.println(sb);

    }
}
