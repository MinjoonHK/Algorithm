import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String,Integer> dict = new HashMap<>();
        for(String[] i : clothes){
            dict.put(i[1],dict.getOrDefault(i[1],1) +1);
        }
        int answer = 1;
        for(String i: dict.keySet()){
            answer *= dict.get(i);
        }
        
        
        return answer -1;
    }
}