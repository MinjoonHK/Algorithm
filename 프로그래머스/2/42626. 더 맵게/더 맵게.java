import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i< scoville.length; i++){
            pq.add(scoville[i]);
        }
        
        
        int counter = 0;
        
        while(pq.peek() < K){

            if(pq.size() == 1){
                return -1;
            }

            int newScoville = pq.poll() + pq.poll() *2;
            pq.add(newScoville);
            counter++;

        }
        
        return counter;
    }
}