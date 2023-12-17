import java.util.*;
import java.io.*;


public class Main{

    static int[][] graph;
    static boolean[] visited;

    static int N,M;


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int counter = 0;
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        for(int i=1; i<=N; i++){
            if(!visited[i]){
                dfs(i);
                counter++;
            }
        }
        System.out.println(counter);
    }

    static void dfs(int node){
        visited[node] = true;
        for(int i=1; i<=N; i++){
            if(graph[node][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }
}
