import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringBuffer sb = new StringBuffer(s);
        String str = sb.reverse().toString();
        if(s.equals(str)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}