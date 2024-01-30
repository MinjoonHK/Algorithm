import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int input = Integer.parseInt(br.readLine());
            if(input == -1){
                break;
            }
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i=1; i<input;i++){
                if(input % i == 0){
                    arr.add(i);
                }
            }

            int sum = 0;

            for(int i:arr){
                sum += i;
            }

            if(sum == input){
                System.out.print(input+" = ");
                int counter = 0;
                for(int i: arr){
                    System.out.print(i);
                    if(counter < arr.size()-1){
                        System.out.print(" + ");
                    }
                    counter++;
                }
                System.out.println();
            }
            else{

                System.out.println(input+" is NOT perfect.");
            }
        }



    }
}
