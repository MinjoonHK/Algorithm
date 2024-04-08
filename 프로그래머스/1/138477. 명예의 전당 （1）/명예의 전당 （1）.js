function solution(k, score) {
    let arr = [];
    let answer = [];
    for(let i=0; i<score.length; i++){
        if(arr.length <k){
            arr.push(score[i]);
        }
        else{
            arr.sort((a,b) => a-b);
            if(arr[0] < score[i]){
                arr[0] = score[i];
            }
        }
        
        answer.push(Math.min(...arr));
    }
    return answer;
}