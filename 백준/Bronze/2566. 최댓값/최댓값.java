import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[9][9];
        int max = 0;
        int row = 1;
        int column = 1;

        for(int i=0; i<9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] > max){
                    max = arr[i][j];
                    row = i+1;
                    column = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row +" "+column);
    }
}