import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        System.out.print(lcm(a,b));

        

    }

    static long gcd(long a, long b){
        if(b ==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }

    static long lcm(long a, long b){
        return (a*b) / gcd(a,b);
    }
}
