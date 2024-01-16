

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static List<Integer>[] relation; //인접리스트 선언
    static boolean[] checked;
    static int res = -1; // 만약 시작과 끝이 같지 않다면 - 관계가 없다면 -1 출력
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        relation = new ArrayList[n+1]; //인접리스트
        checked = new boolean[n+1];
        for(int i=1; i<n+1; i++) {
            relation[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int l = Integer.parseInt(br.readLine());

        for(int i=0; i<l; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            relation[p].add(c); //인접리스트에 인자 추가
            relation[c].add(p); //방향이 없는 그래프 양쪽 다 넣어줌
        }

        dfs(x,y, 0); //x 시작점 y 끝점
        System.out.println(res);
    }

    static void dfs(int start, int end, int cnt) {
        if(start == end) { //만약 시작과 끝이 같다면 res(결과값은) cnt
            res = cnt;
            return;
        }

        checked[start] = true;
        for(int i=0; i<relation[start].size(); i++) {
            int next = relation[start].get(i); //인접리스트의 요소 속의 요소를 하나씩 꺼냄
            if(!checked[next]) {
                dfs(next, end, cnt+1); // 만약 아직 방문하지 않았다면 카운터 + 1 하고 재귀 호출
            }
        }
    }
}