import java.io.*;
import java.util.*;

public class Main {

    static int height, width;
    static char[][] garden;
    static boolean[][] visited;

    static int sheep=0, wolf = 0;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int answerSheep = 0, answerWolf = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        height = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());

        garden = new char[height][width];
        visited = new boolean[height][width];

        for (int x = 0; x < height; x++) {
            garden[x] = br.readLine().toCharArray();
        }


        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                if (!visited[x][y] && (garden[x][y] == 'o' || garden[x][y] == 'v')) {
                    sheep = wolf = 0;
                    dfs(x, y);
                    if(sheep>wolf)
                        answerSheep += sheep;
                    else
                        answerWolf += wolf;
                }
            }
        }

        sb.append(answerSheep).append(" ").append(answerWolf);

        System.out.println(sb);


    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        if(garden[x][y]=='v')
            wolf++;
        if(garden[x][y]=='o')
            sheep++;



        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx<0 || ny<0 || nx>=height || ny>=width || visited[nx][ny] || garden[nx][ny]=='#')
                continue;
            
            dfs(nx, ny);
        }
    }

}