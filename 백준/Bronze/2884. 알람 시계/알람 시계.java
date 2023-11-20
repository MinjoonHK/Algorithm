    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(b >= 45){
                b -= 45;
            }
            else if(b < 45){
                b = 60 + b - 45;
                if(a == 0){
                    a = 23;
                }
                else{
                    a -= 1;
                }
            }
            System.out.println(a + " " + b);
        }
    }