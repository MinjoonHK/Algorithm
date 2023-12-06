import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>(9);
        for(int i=0; i<9;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        System.out.println(Collections.max(arr));
        System.out.println(arr.indexOf(Collections.max(arr))+1);
    }
}