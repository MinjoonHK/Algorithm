import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i=1; i<arr.length; i++){
            answer = lcm(answer,arr[i]);
        }
        return answer;
    }
    
    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
}