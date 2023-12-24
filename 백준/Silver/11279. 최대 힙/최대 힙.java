import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            int cmd = Integer.parseInt(br.readLine());
            if(!maxheap.isEmpty() && cmd == 0){
                System.out.println(maxheap.poll());
            }
            else if(maxheap.isEmpty() && cmd ==0){
                System.out.println(0);
            }
            else{
                maxheap.add(cmd);
            }
        }
    }
}