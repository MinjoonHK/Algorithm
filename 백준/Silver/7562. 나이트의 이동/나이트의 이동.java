import java.util.*;
import java.io.*;


public class Main{

    static int I;

    static int[][] graph;
    static boolean[][] visited;

    static int[] dx = {-2,-1,-1,-2,1,2,1,2};
    static int[] dy = {1,2,-2,-1,2,1,-2,-1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            I = Integer.parseInt(br.readLine());
            graph = new int[I][I];
            visited = new boolean[I][I];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int strX = Integer.parseInt(st.nextToken());
            int strY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            if(strX == endX && strY == endY){
                System.out.println(0);
            }
            else{
                bfs(strX,strY);
                System.out.println(graph[endX][endY]);
            }
        }
    }

    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int curX = poll[0];
            int curY = poll[1];
            for(int i=0; i<8; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];
                if(nx < 0 || ny < 0 || nx >= I || ny >=I){
                    continue;
                }
                if(!visited[nx][ny]){
                    queue.add(new int[]{nx,ny});
                    visited[nx][ny] = true;
                    graph[nx][ny] = graph[curX][curY] + 1;
                }
            }
        }
    }
}
