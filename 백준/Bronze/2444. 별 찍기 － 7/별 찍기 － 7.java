import java.util.*;
import java.io.*;


public class Main{

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N;i++){
            for(int j=0; j<N-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<i*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=N-1; i>0;i--){
            for(int j=0; j<N-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<i*2; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}