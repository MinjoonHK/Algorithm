import java.util.*;
import java.io.*;


public class Main{

    static int[] dx = {-1,1,0,0,1,-1,-1,1};
    static int[] dy = {0,0,-1,1,-1,1,-1,1};
    static boolean[][] visited;
    static int[][] graph;
    static int N,M;
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            if(N ==0 && M==0){
                break;
            }
            graph = new int[M][N];
            visited = new boolean[M][N];
            int counter = 0;
            for(int i=0; i<M; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++){
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    if(graph[i][j] ==1 && !visited[i][j]){
                        dfs(i,j);
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
    }

    static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= M || ny >= N){
                continue;
            }
            if(!visited[nx][ny] && graph[nx][ny] == 1){
                dfs(nx,ny);
            }
        }
    }
}