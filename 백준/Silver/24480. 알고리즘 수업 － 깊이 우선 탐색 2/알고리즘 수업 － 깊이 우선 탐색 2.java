import java.util.*;
import java.io.*;


public class Main {

    static ArrayList<Integer>[] list;
    static boolean[] visited;

    static int counter = 1;

    static int[] answer;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

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


        dfs(R);

        for(int i=0; i<N;i++){
            System.out.println(answer[i]);
        }

    }
    static void dfs(int v){
        visited[v] = true;
        answer[v-1] = counter;
        counter++;
        Collections.sort(list[v], (o1, o2) ->{
            return o2 - o1;
        });
        for(int i=0; i<list[v].size();i++){
            if(!visited[list[v].get(i)]){
                dfs(list[v].get(i));
            }
        }
    }

}