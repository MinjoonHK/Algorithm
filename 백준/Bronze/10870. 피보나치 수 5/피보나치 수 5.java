import java.io.*;
import java.util.*;


public class Main{

    static int N;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }
    static long factorial(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return factorial(n-1) + factorial(n-2);
    }
}