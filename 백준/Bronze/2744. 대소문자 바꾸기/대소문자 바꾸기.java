import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char[] charArr = s.toCharArray();
        for(int i=0; i<charArr.length; i++){
            if((int)charArr[i] <= 90){
                charArr[i] = Character.toLowerCase(charArr[i]);
            }
            else{
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
        }
        
        System.out.println(new String(charArr));

    }
}