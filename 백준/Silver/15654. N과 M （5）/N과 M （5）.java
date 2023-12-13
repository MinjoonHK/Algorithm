import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    static int n,m;
    static int[] numbers;
    static boolean[] check;
    static int[] output;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        numbers = new int[n];
        check = new boolean[n];
        output = new int[m];
        for(int i=0; i<n; i++){

            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        perm(0);
    }

    public static void perm(int depth){
        if(depth == m){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<m; i++){
                sb.append(output[i] +" ");
            }
            System.out.println(sb);
            return;
        }
        for(int i=0; i<n; i++){
            if(check[i] == false){
                if(!check[i]){
                    check[i] = true;
                    output[depth] = numbers[i];
                    perm(depth+1);
                    check[i] = false;
                }
            }
        }
    }
}