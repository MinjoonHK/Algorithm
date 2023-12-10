import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int lastVal = -1;
        while(N-- >0){
            String[] cmd = br.readLine().split(" ");

            if(cmd[0].equals("push")){
                lastVal = Integer.parseInt(cmd[1]);
                queue.offer(lastVal);
            }
            else if(cmd[0].equals("pop")){
                if(queue.isEmpty()){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write( queue.poll() +"\n");
                }
            }
            else if(cmd[0].equals("size")){
                bw.write(queue.size() +"\n");
            }
            else if(cmd[0].equals("empty")){
                if(queue.isEmpty()){
                    bw.write(1+"\n");
                }
                else{
                    bw.write(0+"\n");
                }
            }
            else if(cmd[0].equals("front")){
                if(queue.isEmpty()){
                    bw.write(-1+"\n");
                }
                else{
                    bw.write(queue.peek()+"\n");
                }
            }
            else if(cmd[0].equals("back")){
                if(queue.isEmpty()){
                    bw.write(-1+"\n");
                }
                else{
                    bw.write(lastVal+"\n");
                }
            }
        }
        bw.flush();
    }
}