import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            int cmd = Integer.parseInt(br.readLine());
            if(!minheap.isEmpty() && cmd == 0){
                System.out.println(minheap.poll());
            }
            else if(minheap.isEmpty() && cmd ==0){
                System.out.println(0);
            }
            else{
                minheap.add(cmd);
            }
        }
    }
}