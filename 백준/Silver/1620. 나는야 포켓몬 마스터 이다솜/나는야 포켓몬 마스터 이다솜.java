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
        HashMap<String,String> map = new HashMap<>();
        for(int i=0;i<N;i++){
            String name = br.readLine();
            String number = String.valueOf(i+1);
            map.put(name,number);
            map.put(number,name);
        }
        for(int i=0; i<M;i++){
            String command = br.readLine();
            System.out.println(map.get(command));
        }
    }
}