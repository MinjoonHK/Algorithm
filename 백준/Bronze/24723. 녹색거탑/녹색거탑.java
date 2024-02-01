import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int answer = 1;
        for(int i=1; i<=N;i++){
            answer*=2;
        }
        System.out.print(answer);
    }
}
