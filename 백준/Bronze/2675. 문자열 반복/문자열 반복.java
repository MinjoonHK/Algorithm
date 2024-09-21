

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String answer ="";
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String S = input[1];
            for(int j=0; j<S.length(); j++){
                for(int k=0; k<R; k++){
                    answer += S.charAt(j);
                }
            }
            System.out.println(answer);
        }
        
    }
}
