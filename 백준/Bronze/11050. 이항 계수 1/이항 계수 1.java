import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int bunza = 1;
        int bunmo = 1;

        for(int i = K; i>0;i--){
            bunza *= N;
            N-=1;
            bunmo *= i;
        }
        System.out.println(bunza/bunmo);

    }
}
