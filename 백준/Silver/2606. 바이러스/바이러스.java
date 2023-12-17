import java.util.*;
import java.io.*;

public class Main{

    static int[][] graph;
    static boolean[] visited;

    static int N;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        graph = new int[N+1][N+1];
        visited = new boolean[N+1];
        for(int i=0; i<K; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           graph[a][b] = 1;
           graph[b][a] = 1;
        }
        dfs(1);
        int count = 0;
        for(int i=1; i<N+1; i++){
            if(visited[i]){
                count++;
            }
        }
        System.out.println(count - 1);

    }

    static void dfs(int node){
        visited[node] = true;
        for(int i=1; i< N+1; i++ ){
            if(graph[node][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }
}