import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<N+1;i++){
            queue.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(queue.size() > 1) {

            for(int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }

            sb.append(queue.poll()).append(", ");
        }


        sb.append(queue.poll()).append('>');
        System.out.println(sb);
    }
}