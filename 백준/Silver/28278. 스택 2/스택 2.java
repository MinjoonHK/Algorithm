import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> Stack = new ArrayDeque<>();
        while(N-- >0){
            String[] cmd = br.readLine().split(" ");
            if(cmd[0].equals("1")){
                Stack.offer(Integer.parseInt(cmd[1]));
            }
            else if(cmd[0].equals("2")){
                if(Stack.isEmpty()){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write(Stack.removeLast() +"\n");
                }
            }
            else if(cmd[0].equals("3")){
                bw.write(Stack.size() +"\n");
            }
            else if(cmd[0].equals("4")){
                if(Stack.isEmpty()){
                    bw.write(1+"\n");
                }
                else{
                    bw.write(0+"\n");
                }
            }
            else if(cmd[0].equals("5")){
                if(Stack.isEmpty()){
                    bw.write(-1+"\n");
                }
                else{
                    bw.write(Stack.getLast()+"\n");
                }
            }
        }
        bw.flush();
    }
}