
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        int intA = Integer.parseInt(A);
        String B = br.readLine();
        int intB = Integer.parseInt(B);
        String C = br.readLine();
        int intC = Integer.parseInt(C);
        String AandB = A + B;
        System.out.println(intA + intB - intC);
        System.out.println(Integer.parseInt(AandB) - intC);
    }
}
