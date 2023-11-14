import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hexInput = br.readLine();

//        System.out.println("input: "+hexInput);

        int decimal = Integer.parseInt(hexInput,16);
        System.out.println(decimal);
//        System.out.println("Hex -> Decimal : " + decimal);
//        String hex = Integer.toHexString(decimal);
//        System.out.println("Decimal -> Hex : " + hex);
    }
}