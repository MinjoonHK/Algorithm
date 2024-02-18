import java.util.*;
import java.io.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize == 0){
            return cities.length * 5;
        }
        
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<cities.length; i++){
            if(list.size() < cacheSize && !list.contains(cities[i].toLowerCase())){
                list.add(cities[i].toLowerCase());
                answer += 5;
            }
            else if(list.size() < cacheSize && list.contains(cities[i].toLowerCase())){
                list.remove(cities[i].toLowerCase());
                list.add(cities[i].toLowerCase());
                answer += 1;
            }
            else if(list.size() >= cacheSize && !list.contains(cities[i].toLowerCase())){
                list.remove(0);
                list.add(cities[i].toLowerCase());
                answer += 5;
            }
            else if(list.size() >= cacheSize && list.contains(cities[i].toLowerCase())){
                list.remove(cities[i].toLowerCase());
                list.add(cities[i].toLowerCase());
                answer += 1;
            }
        }
        return answer;
    }
}