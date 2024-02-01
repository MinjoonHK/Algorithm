import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int N = Integer.parseInt(br.readLine());
            int end = 2*N;
            if(N==0){
                break;
            }

            boolean[] primeNumbers = new boolean[end+1];
            primeNumbers[0] = primeNumbers[1] = true;
            for(int i=2; i*i<=end;i++){
                if(!primeNumbers[i]){
                    for(int j=i*i; j<=end;j+=i){
                        primeNumbers[j] = true;
                    }
                }
            }

            int counter =0;
            for(int i=N+1;i<= end;i++){
                if(!primeNumbers[i]){
                    counter++;
                }
            }
            System.out.println(counter);
           
        }
    }
}
