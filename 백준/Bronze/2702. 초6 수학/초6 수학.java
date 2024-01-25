import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.print(lcm(a,b)+" "+gcd(a,b));
            System.out.println();
        }

    }

    static int gcd(int a, int b){
        if(a < b){
            int temp = a;
            a = b;
            b = temp;
        }

        while(b !=0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
}