import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        int[] dp = new int[k+1];
        for (int i=0; i<n; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j+coin[i] <=k; j++){
                dp[j+coin[i]] += dp[j];
            }
        }
        System.out.println(dp[k]);
    }
}