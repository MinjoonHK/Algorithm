    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int answer = 0;
            int N = Integer.parseInt(br.readLine());
            String str = "";
            N /= 4;
            for(int i = 0; i<N; i ++){
                str += "long ";
            }
            str += "int";
            System.out.print(str);
        }
    }