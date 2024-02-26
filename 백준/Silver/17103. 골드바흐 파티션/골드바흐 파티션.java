import java.util.*;
import java.io.*;


public class Main{

    static int MaxVal = 10000001;
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //문제에서 주어진 N의 최대값 1000001
        boolean[] isPrime = new boolean[MaxVal];

        //0 과 1은 소수가 아님
        isPrime[0] = isPrime[1] = true;

        //아리스토 텔레스의 체
        for(int i=2; i*i<= MaxVal-1; i++){
            if(!isPrime[i]){
                for(int j=i + i; j<=MaxVal-1; j+= i){
                    isPrime[j] = true;
                }
            }
        }

        for(int i=0; i<N; i++){
            int input = Integer.parseInt(br.readLine());
            int temp = 0;

            for(int j=2; j<=input / 2; j++){
                if(!isPrime[j] && !isPrime[input - j]){
                        temp++;
                }
            }
            System.out.println(temp);
        }
    }
}