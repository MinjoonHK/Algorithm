import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> st = new Stack();
        for (int i=0; i< arr.length; i++) {
            if (st.empty() || st.peek()!=arr[i]) {
                st.push(arr[i]);
            }
        }
        int[] answer = new int[st.size()];
        for (int i=st.size()-1; i>=0; i--){
            answer[i] = st.pop();
        }
        return answer;
    }
}