import java.io.*;
import java.util.*;
public class Main{
    static int n,m,v;
    static int[][] graph;
    static boolean[] visited1;
    static boolean[] visited2;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        visited1 = new boolean[n+1];
        visited2 = new boolean[n+1];

        graph = new int[n+1][n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(v);
        System.out.println();
        bfs(v);

    }
    static void dfs(int node){
        visited1[node] = true;
        System.out.print(node +" ");
        for(int i=1; i<=n; i++){
            if(graph[node][i] == 1 && !visited1[i]){
                dfs(i);
            }
        }
    }

    static Queue<Integer> queue;

    static void bfs(int node){
        queue = new LinkedList<>();
        queue.add(node);
        visited2[node] = true;
        while(!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now + " ");
            for(int i = 1; i<=n; i++){
                if(graph[now][i] == 1 && !visited2[i]){
                    queue.offer(i);
                    visited2[i] = true;
                }
            }
        }
    }
}