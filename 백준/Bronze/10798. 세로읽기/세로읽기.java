import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args)throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       char[][] arr = new char[15][15];

       for(int i=0; i<5; i++){
           String cmd = br.readLine();
           for(int j=0; j<cmd.length(); j++){
               arr[j][i] = cmd.charAt(j);
           }
       }

       String answer = "";

       for(int i=0; i<15; i++){
           for(int j=0; j<15; j++){
               if(arr[i][j] != 0){
                   answer += arr[i][j];
               }
           }
       }
       System.out.println(answer);
    }
}
