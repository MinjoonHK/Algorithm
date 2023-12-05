import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        b -= 45;
        if (b < 0) {
            a -= 1;
            if (a < 0){
                a += 24;
            }
            b += 60;
        }
        System.out.println(a + " " + b);
    }
}