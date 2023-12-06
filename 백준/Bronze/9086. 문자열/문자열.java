import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        for(int i=0; i<a; i++){
            String s = br.readLine();
            String answer = "";
            answer += s.charAt(0);
            answer += s.charAt(s.length()-1);
            System.out.println(answer);
        }
    }
}