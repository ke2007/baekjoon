import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class java10816_2 {
    static StringTokenizer st;
    public static void main(String[] args)throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> result = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());        // N만큼 숫자를 입력받기위해 M을 입력받음

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {

            int num = Integer.parseInt(st.nextToken()); // 중복확인을 위한 num 을 선언

            if (!result.containsKey(num)) {             //HashMap 에 중복된 값이 없다면

                result.put(num, 1);                     //key, value 형태로 HashMap 에 집어넣음
            } else {                                    // 중복이라면

                int overLabNum = result.get(num) + 1;   //중복값이 있다면 개수 체크를 위해 해당 value 에 1을 더해준다.
                result.put(num, overLabNum);            // 해당 num 에  1을 더해준 value 를 더해줌
            }
        }


        int M = Integer.parseInt(br.readLine());        // M만큼 숫자를 입력받기위해 M을 입력받음

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {                   //M만큼 반복해줌

            int num = Integer.parseInt(st.nextToken()); //중복확인을 위한 num 을 선언

            if (result.containsKey(num)) {              //만약 num 을 key 로 하는 value 가 있다면

                sb.append(result.get(num)).append(" "); // 해당 밸류(중복 개수)를 StringBuilder 에 붙이고  " "을 추가로 붙임

            } else {

                sb.append("0 ");                        //없다면 0을 StringBuilder 에 붙여준다
            }
        }

        sb.deleteCharAt(sb.length() - 1);         //마지막 공백 제거

        System.out.println(sb);                        //최종적으로 StringBuilder 를 출력해준다
    }
}
//Collections.frequency 를 사용해서 처음 시도했던 코드
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();

//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//
//        ArrayList<Integer> input = new ArrayList<>();
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//
//            input.add(Integer.valueOf(st.nextToken()));
//        }
//
//        int M = Integer.parseInt(br.readLine());
//        StringTokenizer st2 = new StringTokenizer(br.readLine());
//
//        for (int i = 0; i < M; i++) {

//            result.add(Integer.valueOf(st2.nextToken()));
//        }
//
//        for (Integer resultValue:result) {

//                sb.append(Collections.frequency(input,resultValue)).append(" ");              //key(resultValue) 의 빈도수를 알려주는 Collections.frequency 메소드를 사용했으나 시간초과...
                                                                                                // 구글링결과 Collections.frequency 의 시간복잡도는 O(n) 이고, for 문을통해 O(n)의 시간복잡도를 가진 frequency 가
                                                                                                // input 배열의 요소 하나하나에 접근해야하므로 O(n) * O(n) =  O(n^2)의 시간복잡도..를 가지게 되서 시간초과 한것같습니다
//
//        }
//
//        sb.deleteCharAt(sb.length()-1);
//        System.out.println(sb);