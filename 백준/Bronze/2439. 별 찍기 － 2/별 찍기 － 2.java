
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++){
            String temp = "";
            for(int j=0; j<N-i; j++){
                temp += " ";
            }
            for(int j=0; j<i; j++){
                temp += "*";
            }
            System.out.println(temp);
        }
    }
}
