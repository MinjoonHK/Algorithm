import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> arr = Arrays.asList(1,1,2,2,2,8);
        List<Integer> arr2 = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        arr2.add(a);
        arr2.add(b);
        arr2.add(c);
        arr2.add(d);
        arr2.add(e);
        arr2.add(f);
        for(int i=0; i<arr.size();i++){
            bw.write((arr.get(i) - arr2.get(i)) +" ");
        }
        bw.flush();
    }
}