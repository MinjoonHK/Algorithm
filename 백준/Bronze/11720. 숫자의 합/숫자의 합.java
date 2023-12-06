import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr = s.split("");
        for(String i : arr){
            int a = Integer.parseInt(i);
            answer += a;
        }
        System.out.println(answer);
    }
}