class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int counter = 0;
        for(int i=0; i< str.length; i++){
            if(str[i].equals(" ")){
                counter = 1;
            }
            else if(counter % 2 == 0){
                str[i] = str[i].toUpperCase();
            }
            else if(counter % 2 != 0){
                str[i] = str[i].toLowerCase();
            }
            counter++;
            answer += str[i];
        }
        return answer;
    }
}