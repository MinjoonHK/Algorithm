import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];
        int[][] answer = new int[a][b];
        for(int i=0; i<a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<b;j++){
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<b; j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<a; i++){
            for(int j=0; j<b;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0; i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
    }
}