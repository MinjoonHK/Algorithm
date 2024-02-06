import java.util.*;
import java.io.*;


public class Main {

    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int N,M,R;
    static int counter = 1;

    static int[] answer;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        list = new ArrayList[N+1];
        visited = new boolean[N+1];
        answer = new int[N];

        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i=1; i<=M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }


        bfs(R);

        for(int i=0; i<N;i++){
            System.out.println(answer[i]);
        }

    }
    static void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visited[v] = true;
        while(!q.isEmpty()){
            int poll = q.poll();
            answer[poll-1] = counter;
            counter++;
            Collections.sort(list[poll]);
            for(int i=0; i<list[poll].size();i++){
                if(!visited[list[poll].get(i)]){
                    visited[list[poll].get(i)] = true;
                    q.add(list[poll].get(i));
                }
            }
        }
    }
}