import java.io.*;
import java.util.*;


public class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(),Integer.parseInt(st.nextToken()));
        }
        int cost = map.get("jinju");
        int number = 0;
        for(int i:map.values()){
            if(i > cost){
                number++;
            }
        }
        System.out.println(cost);
        System.out.println(number);
    }
}