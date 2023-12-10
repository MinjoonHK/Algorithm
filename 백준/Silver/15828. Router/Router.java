import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int buffer = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        while(true){
            int cmd = Integer.parseInt(br.readLine());
            if(cmd == -1){
                break;
            }
            else if(cmd == 0){
                queue.poll();
            }
            else if(buffer > queue.size()){
                queue.offer(cmd);
            }
        }
        if(queue.size() == 0){
            System.out.println("empty");
        }
        else{
            for(int i:queue){
                sb.append(i);
                sb.append(" ");
            }
            System.out.println(sb);
        }

    }
}