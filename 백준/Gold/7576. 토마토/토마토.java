import java.io.*;
import java.util.*;

public class Main{

    static int[][] graph;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static int N,M;
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[M][N];
        for(int i=0;i<M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs();
        int answer = 0;
        loop:
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(graph[i][j] == 0){
                    answer = -1;
                    break loop;
                }
                else{
                    if(graph[i][j] > answer){
                        answer = graph[i][j];
                    }
                }
            }
        }
        if(answer == -1){
            System.out.println(-1);
        }
        else{
            System.out.println(answer -1);
        }

    }
    static void bfs(){
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(graph[i][j] == 1){
                    queue.add(new int[]{i,j});
                }
            }
        }
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int curX = poll[0];
            int curY = poll[1];
            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                if(nx <0 || ny < 0 || nx >= M || ny >= N){
                    continue;
                }
                if(graph[nx][ny] == 0){
                    graph[nx][ny] = graph[curX][curY] + 1;
                    queue.add(new int[]{nx,ny});
                }
            }
        }
    }
}