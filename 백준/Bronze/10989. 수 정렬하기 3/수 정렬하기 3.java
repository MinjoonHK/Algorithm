import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }
        Arrays.sort(arr);
        for(int j=0; j<N; j++){
            bw.write(arr[j] + "\n");
        }
        bw.flush();
    }
}