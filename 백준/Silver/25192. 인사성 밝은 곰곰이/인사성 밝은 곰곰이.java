import java.util.*;
import java.io.*;


public class Main{

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        HashSet<String> set = new HashSet<>();
        while(n --> 0) {
            String s = br.readLine();

            if(s.equals("ENTER")) {
                answer += set.size();
                set.clear();
                continue;
            }
            set.add(s);
        }

        System.out.print(answer + set.size());
    }
}