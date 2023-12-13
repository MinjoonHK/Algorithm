import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    static int[] cache = new int[50];
    public static int fibo(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        if(cache[n] !=0){
            return cache[n];
        }
        cache[n] = fibo(n-1) + fibo(n-2);
        return cache[n];
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fibo(N));
    }
}