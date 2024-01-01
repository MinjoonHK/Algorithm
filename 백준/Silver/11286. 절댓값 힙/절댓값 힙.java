import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { // return 의 먼저 나오는 값이 앞으로
                if(Math.abs(o1) > Math.abs(o2)){
                    return Math.abs(o1) - Math.abs(o2);
                }
                else if(Math.abs(o1) == Math.abs(o2)){
                    return o1 - o2;
                }
                else{
                    return -1;
                }
            }
        });
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N;i++){
            int number = Integer.parseInt(br.readLine());
            if(number == 0){
                if(queue.isEmpty()){
                    sb.append(number).append("\n");
                }
                else{
                    sb.append(queue.poll()).append("\n");
                }
            }
            else{
                queue.add(number);
            }
        }
        System.out.println(sb);
    }
}