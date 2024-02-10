import java.util.*;
import java.io.*;


public class Main{

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        long[] dist = new long[N-1];
        long[] cost = new long[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++){
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            cost[i] = Long.parseLong(st.nextToken());
        }

        long curCost = cost[0];
        long answer = 0;
        for(int i=0; i<N-1; i++){
            if(curCost > cost[i]){
                curCost = cost[i];
            }
            answer += dist[i] * curCost;
        }
        System.out.println(answer);
    }
}