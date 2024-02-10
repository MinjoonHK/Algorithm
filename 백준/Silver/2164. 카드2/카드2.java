import java.util.*;
import java.io.*;


public class Main{

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();

        for(int i=1; i<=N;i++){
            dq.add(i);
        }

        while(dq.size() > 1 ){
            dq.pop();
            dq.addLast(dq.pop());
        }

        System.out.println(dq.getFirst());

    }


}