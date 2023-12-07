import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        List<String> arr = new ArrayList<String>(Arrays.asList(str));
        List<Integer> arr2 = new ArrayList<Integer>();
        for(String c : arr){
            arr2.add(Integer.parseInt(c));
        }
        answer += Collections.min(arr2).toString();
        answer += " ";
        answer += Collections.max(arr2).toString();
        return answer;
    }
}