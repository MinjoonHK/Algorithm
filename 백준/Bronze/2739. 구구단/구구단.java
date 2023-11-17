    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int A = Integer.parseInt(br.readLine());
            for(int i = 1;i<10;i++){
                System.out.println(A+" * "+i+" = "+A*i);
            }
        }
    }