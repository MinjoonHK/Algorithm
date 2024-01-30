import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer =0;

        String cmd = br.readLine();
        for(int i=0; i<cmd.length(); i++){
            if(cmd.charAt(i) == 'W' || cmd.charAt(i) == 'X' || cmd.charAt(i) == 'Y' || cmd.charAt(i) == 'Z'){
                answer += 10;
            }
            if(cmd.charAt(i) == 'T' || cmd.charAt(i) == 'U' || cmd.charAt(i) == 'V'){
                answer += 9;
            }
            if(cmd.charAt(i) == 'P' || cmd.charAt(i) == 'Q' || cmd.charAt(i) == 'R' || cmd.charAt(i)=='S'){
                answer += 8;
            }
            if(cmd.charAt(i) == 'M' || cmd.charAt(i) == 'N' || cmd.charAt(i) == 'O'){
                answer += 7;
            }
            if(cmd.charAt(i) == 'J' || cmd.charAt(i) == 'K' || cmd.charAt(i) == 'L'){
                answer += 6;
            }
            if(cmd.charAt(i) == 'G' || cmd.charAt(i) == 'H' || cmd.charAt(i) == 'I'){
                answer += 5;
            }
            if(cmd.charAt(i) == 'D' || cmd.charAt(i) == 'E' || cmd.charAt(i) == 'F'){
                answer += 4;
            }
            if(cmd.charAt(i) == 'A' || cmd.charAt(i) == 'B' || cmd.charAt(i) == 'C'){
                answer += 3;
            }
        }
        System.out.println(answer);
    }
}
