import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int b = Integer.parseInt(br.readLine());
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == b){
                count++;
            }
        }
        System.out.println(count);
    }
}