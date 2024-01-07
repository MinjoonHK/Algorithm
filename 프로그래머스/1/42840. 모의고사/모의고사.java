import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] answers) {
        
        
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == person1[i%person1.length]){
                temp1++;
            }
            if(answers[i] == person2[i%person2.length]){
                temp2++;
            }
            if(answers[i] == person3[i%person3.length]){
                temp3++;
            }
        }
        
        ArrayList<Integer> tempArray = new ArrayList<>();
        
        int temp = Math.max(temp1,Math.max(temp2,temp3));
        
        if(temp1 == temp){
            tempArray.add(1);
        }
        if(temp2 == temp){
            tempArray.add(2);
        }
        if(temp3 == temp){
            tempArray.add(3);
        }
        
        int[] answer = new int[tempArray.size()];
        
        for(int i=0; i<tempArray.size(); i++){
            answer[i] = tempArray.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}