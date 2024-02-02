import java.util.*;
import java.io.*;


public class Main{

    static int[][] map;
    static int N;

    static int counter;
    static boolean[][] visited;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> result = new ArrayList<>();

        N = Integer.parseInt(br.readLine());

        visited = new boolean[N][N];
        map = new int[N][N];

        for(int i=0; i<N;i++){
            String s = br.readLine();
            for(int j=0; j<N;j++){
                map[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }

        counter = 1;

        for(int i=0; i<N;i++){
            for(int j=0; j<N;j++){
                if(map[i][j] != 0 && !visited[i][j]){
                    dfs(i,j);
                    result.add(counter);
                    counter = 1;
                }
            }
        }

        Collections.sort(result);
        
        System.out.println(result.size());
        for(int i=0; i<result.size();i++){
            System.out.println(result.get(i));
        }
    }

    static void  dfs(int x, int y){
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx <0 || nx >= N || ny <0 || ny >= N){
                continue;
            }

            if(map[nx][ny] != 0 && !visited[nx][ny]){
                counter++;
                dfs(nx,ny);
            }
        }
    }
}