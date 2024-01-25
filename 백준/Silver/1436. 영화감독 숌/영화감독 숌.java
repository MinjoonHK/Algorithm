import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<String> stack = new Stack<>();
        int i = 666;
        int counter = 0;

        while(true){
            if(counter == N){
                break;
            }

            String s = Integer.toString(i);
            if(s.contains("666")){
                stack.add(s);
                counter++;
            }
            i++;
        }

        System.out.println(stack.pop());
    }
}