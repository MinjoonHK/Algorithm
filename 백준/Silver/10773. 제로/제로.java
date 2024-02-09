import java.util.*;
import java.io.*;


public class Main{

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++){
            int input = Integer.parseInt(br.readLine());
            if(input ==0){
                stack.pop();
            }
            else{
                stack.add(input);
            }
        }

        int answer = 0;

        for(int i=0; i<stack.size();i++){
            answer += stack.get(i);
        }

        System.out.println(answer);



    }


}