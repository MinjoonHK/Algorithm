    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            for(int i = 0;i<N;i++){
                String str = br.readLine();
                StringTokenizer st = new StringTokenizer(str, " ");
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                System.out.println(A+B);
            }
        }
    }