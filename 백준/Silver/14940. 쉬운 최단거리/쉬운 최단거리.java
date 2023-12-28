import java.io.*;
import java.util.*;


public class Main{

    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int N,M;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int start = 0;
        int end = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(graph[i][j] == 2){
                    start = i;
                    end = j;
                }
            }
        }
        graph[start][end] = 0;
        bfs(start,end);
        for(int i=0; i<N; i++){
            for(int j=0; j<M;j++){
                if(graph[i][j] !=0 && !visited[i][j]){
                    graph[i][j] = -1;
                }
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int CurX = poll[0];
            int CurY = poll[1];
            for(int i=0; i<4; i++){
                int nx = CurX + dx[i];
                int ny = CurY + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M){
                    continue;
                }
                if(!visited[nx][ny] && graph[nx][ny] != 0){
                    graph[nx][ny] = graph[CurX][CurY] + 1;
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx,ny});
                }
            }
        }
    }
}