import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int a = Integer.parseInt(st.nextToken());
       int b = Integer.parseInt(st.nextToken());
       if (a > b){
           System.out.println(">");
       }
       else if (a<b){
           System.out.println("<");
       }
       else{
           System.out.println("==");
       }
    }
}