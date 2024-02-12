import java.util.*;
import java.io.*;


public class Main{

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        Stack<Integer> stack = new Stack<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] copyArr = arr.clone();
        Arrays.sort(copyArr);
        int temp = 0;

        for(int i=0; i<N; i++){
            stack.add(arr[i]);
            while(true){
                if(stack.isEmpty()){
                    break;
                }
                else if(stack.peek() == copyArr[temp]){
                    stack.pop();
                    temp++;
                }
                else{
                    break;
                }
            }
        }


        System.out.println(stack.size() == 0 ? "Nice" : "Sad");

    }
}