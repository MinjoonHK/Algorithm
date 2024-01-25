import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int[] answer = new int[N];

        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            int temp = 1;
            for(int j=0; j<N;j++){
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    temp++;
                }
            }
            answer[i] = temp;
        }

        for(int i=0; i<N; i++){
            System.out.print(answer[i]+" ");
        }


    }

}
