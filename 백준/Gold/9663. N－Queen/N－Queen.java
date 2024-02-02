import java.util.*;
import java.io.*;


public class Main
{
    static int N;
    static int[] arr;
    static int count =0;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //N개의 퀸
        arr = new int[N];

        dfs(0);
        System.out.println(count);
    }

    static void dfs(int depth){
        if(depth == N){ // 퀸을 전부 놓는다면
            count++; // 방법하나 추가
            return;
        }
        for(int i=0; i<N;i++){ //아직 퀸을 다 놓지 않았다면
            arr[depth] = i; //배열에 저장?
            if(possible(depth)){ //조건을 통과하면
                dfs(depth+1); //다시 퀸을 놓음
            }
        }
    }

    static boolean possible(int col){ //퀸을 놓은 갯수?
        for(int i=0; i<col; i++){
            if(arr[i] == arr[col]){ //같은 행에 있는지
                return false;
            }
            else if(Math.abs(col-i) == Math.abs(arr[col] - arr[i])){ // 대각선 방향에 있는지
                return false;
            }

        }
        return true; //같은행과 대각선에 없다면 트루
    }
}