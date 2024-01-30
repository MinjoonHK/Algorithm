import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=N; i++){
            if(N % i ==0){
                arr.add(i);
            }
        }

        if(arr.size() < K){
            System.out.println(0);
        }
        else{
            System.out.println(arr.get(K-1));
        }

    }
}
