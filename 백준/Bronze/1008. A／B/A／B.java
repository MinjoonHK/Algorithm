import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       double a = Double.parseDouble(st.nextToken());
       double b = Double.parseDouble(st.nextToken());
       System.out.println(a/b);
    }
}