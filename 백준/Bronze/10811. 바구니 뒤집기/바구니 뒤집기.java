import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            basket[i] = i;
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());

            for(int j = I; j <= (I + J) / 2; j++) {
                int tmp = basket[j];
                basket[j] = basket[J + I - j];
                basket[J + I - j] = tmp;
            }
        }
        for(int i = 1; i <= N; i++) {
            sb.append(basket[i]).append(" ");
        }
        System.out.println(sb);
    }
}