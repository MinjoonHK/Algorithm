import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Deque<Integer> deque = new ArrayDeque<>();
       int N = Integer.parseInt(br.readLine());
       for(int i=0; i<N; i++){
           String[] cmd = br.readLine().split(" ");
           if(cmd[0].equals("push_front")){
               deque.addFirst(Integer.parseInt(cmd[1]));
           }
           else if(cmd[0].equals("push_back")){
               deque.addLast(Integer.parseInt(cmd[1]));
           }
           else if(cmd[0].equals("pop_front")){
               if(deque.isEmpty()){
                   System.out.println(-1);
               }
               else{
                   System.out.println(deque.removeFirst());
               }
           }
           else if(cmd[0].equals("pop_back")){
               if(deque.isEmpty()){
                   System.out.println(-1);
               }
               else{
                   System.out.println(deque.removeLast());
               }
           }
           else if(cmd[0].equals("size")){
               System.out.println(deque.size());
           }
           else if(cmd[0].equals("empty")){
               if(deque.isEmpty()){
                   System.out.println(1);
               }
               else{
                   System.out.println(0);
               }
           }
           else if(cmd[0].equals("front")){
               if(deque.isEmpty()){
                   System.out.println(-1);
               }
               else{
                   System.out.println(deque.getFirst());
               }
           }
           else if(cmd[0].equals("back")){
               if(deque.isEmpty()){
                   System.out.println(-1);
               }
               else{
                   System.out.println(deque.getLast());
               }
           }
       }
    }
}