import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[M+1];
        prime[0] = prime[1] = true;

        for(int i = 2; i*i<=M;i++){
            if(!prime[i]){
                for(int j=i*i; j<=M; j+=i){
                    prime[j] = true;
                }
            }
        }

        for(int i=0; i<prime.length;i++){
            if(!prime[i] && i >= N && i <=M){
                System.out.println(i);
            }
        }
    }
}
