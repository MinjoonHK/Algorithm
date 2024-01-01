import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N;i++){
            int number = Integer.parseInt(br.readLine());
            queue.add(number);
        }
        int answer = 0;
        while(queue.size() > 1){
            int temp1 = queue.poll();
            int temp2 = queue.poll();
            answer += temp1 + temp2;
            queue.add(temp1 + temp2);
        }
        System.out.println(answer);
    }
}