import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    static long[] dp = new long[1001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(tiling(n));
    }

    static long tiling(int n){
        dp[0] = 1;
        dp[1] = 1;
        for(int i =2; i<=n; i++){
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        }
        return dp[n] % 10007;
    }
}