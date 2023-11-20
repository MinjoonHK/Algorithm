    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(br.readLine());
            if(c + b >= 60){
                a += (c+b) / 60;
                b = (b+c) % 60;
                if(a >= 24){
                    a -= 24;
                }
            }
            else{
                b += c;
            }
            System.out.println(a+" "+b);
        }
    }