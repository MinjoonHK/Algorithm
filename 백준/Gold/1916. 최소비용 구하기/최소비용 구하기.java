import java.io.*;
import java.util.*;



class Node implements Comparable<Node>{
    int end;
    int weight;

    Node(int end, int weight){
        this.end = end;
        this.weight = weight;
    }
    @Override
    public int compareTo(Node o){
        return weight - o.weight;
    }
}
public class Main{


    static int N,M;
    static int[] dist; // 시작점에서 각 정점으로 가는 최단거리
    static ArrayList<ArrayList<Node>> arr; // 인접리스트
    static boolean[] visited;




    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine()); //정점의 개수
        M = Integer.parseInt(br.readLine()); //간선의 개수

        arr = new ArrayList<>();
        dist = new int[N + 1];
        visited = new boolean[N + 1];

        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i <= N; i++) {
            arr.add(new ArrayList<>()); //인접리스트 구현
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            arr.get(start).add(new Node(end, weight));
        }

        st = new StringTokenizer(br.readLine());
        int startPos = Integer.parseInt(st.nextToken());
        int endPos = Integer.parseInt(st.nextToken());

        bw.write(dijkstra(startPos, endPos) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
    static int dijkstra(int start, int end){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[N+1];
        pq.offer(new Node(start, 0));
        dist[start] = 0;

        while(!pq.isEmpty()){
            Node curNode = pq.poll();
            int cur = curNode.end;
            if(!visited[cur]){
                visited[cur] = true;

                for (Node node : arr.get(cur)) {
                    if (!visited[node.end] && dist[node.end] > dist[cur] + node.weight) {
                        dist[node.end] = dist[cur] + node.weight;
                        pq.add(new Node(node.end, dist[node.end]));
                    }
                }
            }
        }
        return dist[end];
    }
}