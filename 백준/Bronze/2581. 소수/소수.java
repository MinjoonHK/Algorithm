import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int sum =0;
        int firstNum = 0;
        for(int i=N; i<=M;i++){
            int temp =0;
            for(int j=1;j<=i;j++){
                if(i % j ==0){
                    temp++;
                }
            }
            if(temp == 2){
                sum+= i;
                if(firstNum == 0){
                    firstNum = i;
                }
            }
        }
        if(sum == 0){
            System.out.print(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(firstNum);
        }


    }
}
