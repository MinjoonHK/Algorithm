import java.util.*;
import java.io.*;

//첫째 줄에는 사각형 모양 판의 세로와 가로의 길이가 양의 정수로 주어진다. 세로와 가로의 길이는 최대 100이다. 판의 각 가로줄의 모양이 윗 줄부터 차례로 둘째 줄부터 마지막 줄까지 주어진다. 치즈가 없는 칸은 0, 치즈가 있는 칸은 1로 주어지며 각 숫자 사이에는 빈칸이 하나씩 있다.

//첫째 줄에는 치즈가 모두 녹아서 없어지는 데 걸리는 시간을 출력하고, 둘째 줄에는 모두 녹기 한 시간 전에 남아있는 치즈조각이 놓여 있는 칸의 개수를 출력한다.

public class Main {
    static int N,M,cheese,ans,time;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};


    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cheese = 0;
        time =0;
        ans = 0;

        map = new int[N][M];


        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1){
                    cheese++; // 치즈의 개수
                }
            }
        }

        while(cheese!= 0){ // 치즈가 다 녹기전이라면
            time++; // 시간을 1 늘려주고
            ans = cheese; // 모두 녹기 1시간전에 남아있는 치즈 갯수
            bfs();
        }

        System.out.println(time);
        System.out.println(ans);
    }

    static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        visited = new boolean[N][M]; // 새로운 판때기를 만들어야 하기 때문에 위에 선언하면 안됨
        visited[0][0] = true;

        while(!q.isEmpty()){
            int[] poll = q.poll();
            int curX = poll[0];
            int curY = poll[1];

            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx <0 || ny < 0 || nx >= N || ny >= M){
                    continue;
                }

                if(!visited[nx][ny] && map[nx][ny] == 1){ //만약 방문하지 않고 그곳에 치즈가 있다면
                    cheese--; //치즈 갯수를 하나빼고
                    map[nx][ny] = 0; //치즈를 녹임
                }
                else if(!visited[nx][ny] && map[nx][ny] == 0) { //만약 빈곳이면
                    q.add(new int[]{nx, ny}); //전진
                }
                visited[nx][ny] = true; //방문 처리
            }
        }
    }
}
