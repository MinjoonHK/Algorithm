import java.util.*;
import java.io.*;

public class Main{


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Double> map = new HashMap<>();

        map.put("A+",4.5);
        map.put("A0",4.0);
        map.put("B+",3.5);
        map.put("B0",3.0);
        map.put("C+",2.5);
        map.put("C0",2.0);
        map.put("D+",1.5);
        map.put("D0",1.0);
        map.put("F",0.0);

        double total =0;
        double sum = 0;

        for(int i=0; i<20; i++){
            String[] cmd = br.readLine().split(" ");
            if(cmd[2].equals("P")){
                continue;
            }
            double score = Double.parseDouble(cmd[1]);
            sum += score * map.get(cmd[2]);
            total += score;
        }


        if(total == 0){
            System.out.printf("%.6",0.000000);
        }
        else{
            double answer = sum / total;

            System.out.printf("%.6f", answer);
        }



    }
}