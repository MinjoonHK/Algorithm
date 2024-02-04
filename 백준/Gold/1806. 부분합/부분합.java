import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int start = 0;
        int end = 0;
        int sum = 0;
        int answer = Integer.MAX_VALUE;

        while(start <= end && end <= N){
            if(sum < M){
                sum += arr[end++]; // end 가 증가하면서 하나씩 더함
            }
            else if(sum >= M){
                answer = Math.min(answer,end-start);
                sum -= arr[start++]; // 만약 합이 목표한 값보다 크다면 꼬리(start) 쪽 을 하나 빼면서 start 증가
            }
        }

        System.out.println(answer == Integer.MAX_VALUE ? 0 : answer);

    }
}