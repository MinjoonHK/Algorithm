import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int answer = 0;
        int counter = 0;
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int j= arr.length-1; j >= 0; j--) {
            if(arr[j] > K){
                continue;
            }
            if(answer == K){
                break;
            }
            else{
                while(true){
                    if(answer + arr[j] > K){
                        break;
                    }
                    else{
                        answer += arr[j];
                        counter ++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}