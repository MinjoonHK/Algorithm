import java.util.*;
import java.io.*;


public class Main{

    static int[][] graph;

    static boolean[][] visited;
    static int[] dx;
    static int[] dy;

    static List<Integer> result;

    static Queue<int[]> queue;

    static int counter,N;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        result = new LinkedList<>();
        graph = new int[N][N];
        visited = new boolean[N][N];
        counter = 1;

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                graph[i][j] = str.charAt(j)-'0';
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(graph[i][j] == 1 && !visited[i][j]){
                    bfs(i,j);
                    result.add(counter);
                    counter = 1;
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for(int i : result){
            System.out.println(i);
        }

    }

    static void bfs(int x, int y){
        dx = new int[] {-1,1,0,0};
        dy = new int[] {0,0,-1,1};
        queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;
        while(!queue.isEmpty()){
            int curx = queue.peek()[0];
            int cury = queue.peek()[1];
            queue.poll();
            for(int i=0; i<4; i++){
                int nx = curx + dx[i];
                int ny = cury + dy[i];

                if(nx >= 0 && ny >= 0 && nx < N && ny < N){
                    if(graph[nx][ny] == 1 && !visited[nx][ny]){
                        queue.add(new int[]{nx,ny});
                        visited[nx][ny] = true;
                        counter++;
                    }
                }
            }
        }
    }
}