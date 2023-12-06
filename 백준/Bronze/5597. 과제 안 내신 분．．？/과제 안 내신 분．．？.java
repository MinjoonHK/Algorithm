import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<28;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        for(int j=1; j<31;j++){
            if(!arr.contains(j)){
                System.out.println(j);
            }
        }
    }
}