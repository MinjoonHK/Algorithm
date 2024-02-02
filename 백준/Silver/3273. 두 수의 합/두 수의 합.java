import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine()); // ai + aj 가 되는 수

        Arrays.sort(arr);

        int start = 0;
        int end = N-1;
        int counter = 0;
        int sum = 0;

        while(start < end){
            sum = arr[start] + arr[end];
            if(sum == x){
                counter++;
            }
            if(sum <= x){ // 만약 합이 작다면 스타트 하나 옮기기
                start++;
            }
            else{ //만약 합이 크다면 엔드 하나 줄이기
                end--;
            }
        }
        System.out.println(counter);
    }
}

