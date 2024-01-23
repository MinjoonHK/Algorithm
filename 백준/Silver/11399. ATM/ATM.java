import java.util.*;
import java.io.*;


public class Main {

   public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       int[] arr = new int[N];

       StringTokenizer st = new StringTokenizer(br.readLine());
       for(int i=0; i<N;i++){
           arr[i] = Integer.parseInt(st.nextToken());
       }

       Arrays.sort(arr);

       int answer = 0;
       int temp =0;

       for(int i=0; i<N;i++){
           temp += arr[i];
           answer += temp;
       }

       System.out.println(answer);
   }
}