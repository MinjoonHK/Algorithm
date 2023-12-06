import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> arr = new ArrayList<Integer>();
        for(int i =0; i<10;i++){
            int a = Integer.parseInt(br.readLine());
            if(!arr.contains(a%42)){
                arr.add(a%42);
            }
        }
        System.out.println(arr.size());
    }
}