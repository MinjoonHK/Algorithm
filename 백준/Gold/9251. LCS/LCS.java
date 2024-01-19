import java.util.*;
import java.io.*;

//LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.
//예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.

public class Main {

    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();

        int length_1 = str1.length;
        int length_2 = str2.length;

        int[][] dp = new int[length_1 +1][length_2 +1];

        for(int i=1; i<=length_1; i++){
            for(int j=1; j<=length_2; j++){


                //만약[i-1] 번째 문자가 [j-1] 번쨰 문자와 일치한다면
                if(str1[i-1] == str2[j-1]){

                    //대각선 위 값에 + 1
                    dp[i][j] = dp[i-1][j-1] +1;
                }

                else{

                    //아니라면 윗값 혹은 왼쪽값중에 큰걸로 대체
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[length_1][length_2]);
    }
}
