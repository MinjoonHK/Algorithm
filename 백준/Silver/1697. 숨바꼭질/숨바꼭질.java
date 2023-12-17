import java.util.*;
import java.io.*;


public class Main{
    static int N,K;
    static int[] visited = new int[100001];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        System.out.println(bfs(N));
    }

    static int bfs(int node){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        int n = 0;
        visited[node] = 1;
        while (!queue.isEmpty())
        {
            n = queue.poll();

            if (n == K)
            {
                return visited[n]-1;
            }

            if (n-1>=0 && visited[n-1] == 0)
            {
                visited[n-1] = visited[n]+1;
                queue.add(n-1);
            }
            if (n+1 <= 100000 && visited[n+1] == 0)
            {
                visited[n+1] = visited[n]+1;
                queue.add(n+1);
            }
            if (2*n <= 100000 && visited[2*n] == 0)
            {
                visited[2*n] = visited[n] + 1;
                queue.add(2*n);
            }
        }
        return -1;
        
    }
}