    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            if(A > 0 && B > 0){
                System.out.println(1);
            }
            else if(A < 0 && B > 0){
                System.out.println(2);
            }
            else if(A < 0 && B < 0){
                System.out.println(3);
            }
            else{
                System.out.println(4);
            }
        }
    }