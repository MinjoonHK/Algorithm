import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<String> answer = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<N;i++){
            String s = br.readLine();
            map.put(s,1);
        }
        for(int i=0; i<M;i++){
            String s = br.readLine();
            if(map.containsKey(s)){
                answer.add(s);
            }
        }
        System.out.println(answer.size());
        Collections.sort(answer);
        for(String s :answer){
            System.out.println(s);
        }
    }
}