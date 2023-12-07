import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Double> arr = new ArrayList<Double>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++) {
            double a = Double.parseDouble(st.nextToken());
            arr.add(a);
        }
        double answer = 0;
        double max = Collections.max(arr) * 100;
        for(double j : arr){
            answer += (j/max) * 100;
        }
        System.out.println((answer / N)*100);
    }
}