
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);
        String[] arr = br.readLine().split(" ");
        String answer = "";
        for(int i=0; i<N; i++){
            if(Integer.parseInt(arr[i])<X){
                answer += arr[i]+" ";
            }
        }
        System.out.println(answer.trim());
    }
}
