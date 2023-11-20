    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            int answer = 0;
            for(int i = 1; i <a+1; i++){
                answer += i;
            }
            System.out.println(answer);

        }
    }