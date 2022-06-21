import java.io.IOException;
import java.util.Scanner;

public class java1978 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();//값을 입력 받음

        int count = 0;

        for(int i = 0; i<N; i++){
            boolean isPrime = true;

            int num = in.nextInt();

            if(num ==1){
                continue;
            }
            for(int j =2; j<=Math.sqrt(num); j++){
                if(num % j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println(count);


    }
}
