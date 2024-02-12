import java.util.*;
import java.io.*;


public class Main{

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new LinkedList<>();

        for(int i=1; i<=N; i++){
            dq.add(i);
        }
        sb.append("<");

        int counter = 1;
        while(!dq.isEmpty()){
            if(counter != K){
                dq.add(dq.pollFirst());
                counter++;
            }
            else{
                sb.append(dq.pollFirst());
                if(dq.size() == 0){
                    break;
                }
                sb.append(", ");
                counter = 1;
            }
        }

        sb.append(">");

        System.out.println(sb);
    }
}