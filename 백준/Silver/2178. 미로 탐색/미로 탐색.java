import java.util.*;
import java.io.*;

public class Main{

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static Queue<int[]> queue;

    static int N,M;

    static int[][] graph;
    static boolean[][] visited;

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<M; j++){
                graph[i][j] = s.charAt(j) - '0';
            }
        }
        bfs(0,0);
        System.out.println(graph[N-1][M-1]);
    }
    static void bfs(int x, int y){
        queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = true;
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int curX = poll[0];
            int curY = poll[1];
            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                if(nx < 0 || nx >= N || ny <0 || ny>= M){
                    continue;
                }
                if(!visited[nx][ny] && graph[nx][ny] == 1){
                    graph[nx][ny] = graph[curX][curY] + 1;
                    queue.offer(new int[]{nx,ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}