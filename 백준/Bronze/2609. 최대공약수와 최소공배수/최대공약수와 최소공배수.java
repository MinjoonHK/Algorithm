import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }

    static int gcd(int a, int b){
        if(b ==0){
            return a;
        }
        else{
            return gcd(b, a % b);
        }
    }

    static int lcm(int a, int b){
        return (a*b) / gcd(a,b);
    }
}
