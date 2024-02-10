import java.util.*;
import java.io.*;


public class Main{

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] dist = new int[N-1];
        int[] cost = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++){
            dist[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }

        int curCost = cost[0];
        int answer = 0;
        for(int i=0; i<N-1; i++){
            if(curCost > cost[i]){
                curCost = cost[i];
            }
            answer += dist[i] * curCost;
        }
        System.out.println(answer);
    }
}