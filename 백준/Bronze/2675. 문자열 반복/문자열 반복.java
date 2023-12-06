import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String b = st.nextToken();
            String[] arr = b.split("");
            for(String c : arr){
                bw.write(c.repeat(a));
            }
            bw.write("\n");
        }
        bw.flush();

    }
}