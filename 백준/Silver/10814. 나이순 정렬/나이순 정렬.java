import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<2;j++){
                arr[i][j] = st.nextToken();
            }
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });
        for(String[] i:arr){
            sb.append(i[0]).append(" ").append(i[1]).append("\n");
        }
        System.out.println(sb);
    }
}