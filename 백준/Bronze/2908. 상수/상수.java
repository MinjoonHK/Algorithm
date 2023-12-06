import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        StringBuffer sb1 = new StringBuffer(a);
        String str1 = sb1.reverse().toString();
        StringBuffer sb2 = new StringBuffer(b);
        String str2 = sb2.reverse().toString();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        if(num1 > num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }
    }
}