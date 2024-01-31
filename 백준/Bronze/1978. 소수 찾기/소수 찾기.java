import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        for(int i=0; i<N;i++){
            int temp = Integer.parseInt(st.nextToken());
            int check = 0;
            for(int j=1; j<=temp;j++){
                if(temp % j==0){
                    check++;
                }
            }
            if(check == 2){
                answer++;
            }
        }
        System.out.print(answer);
    }
}
