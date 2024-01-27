import java.util.*;
import java.io.*;
public class Main {

    static int[][] map;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int N;

    static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = null;
        int idx = 1;

        while(!(line = br.readLine()).equals("0")){
            N = Integer.parseInt(line);
            map = new int[N][N];

            StringTokenizer st = null;
            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int cost = dijkstra();
            sb.append("Problem " + idx + ": " + cost + "\n");
            idx++;
        }
        System.out.println(sb);
    }

    static int dijkstra() {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[][] move = new int[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(move[i], INF);
        }

        pq.add(new Node(0,0,map[0][0]));
        move[0][0] = map[0][0];


        while (!pq.isEmpty()) {
            Node nodePoll = pq.poll();
            int curX = nodePoll.x;
            int curY = nodePoll.y;
            int cost = nodePoll.cost;

            if (curX == N - 1 && curY == N - 1) {
                return cost;
            }

            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx <0 || nx >= N || ny <0 || ny >= N){
                    continue;
                }

                if(cost + map[nx][ny] < move[nx][ny]){
                    move[nx][ny] = cost + map[nx][ny];
                    pq.add(new Node(nx,ny,cost+map[nx][ny]));
                }
            }
        }
        return -1;
    }
}

class Node implements Comparable<Node>{

    int x;
    int y;
    int cost;


   public Node(int x, int y, int cost){
       this.x = x;
       this.y = y;
       this.cost = cost;
   }

    @Override
    public int compareTo(Node o){
        return this.cost - o.cost;
    }

}