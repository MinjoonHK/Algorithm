import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int types = nums.length / 2;
        
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0) +1);
        }
        
        if(map.size() < types){
            return map.size();
        }
        else{
            return types;
        }
    }
}