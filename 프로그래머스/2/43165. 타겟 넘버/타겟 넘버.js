function solution(numbers, target) {
    var answer = 0;
    
    const dfs = (numbers,idx,curX) =>{
        if(idx == numbers.length && curX == target){
            answer += 1;
            return
        }
        else if(idx == numbers.length && curX != target){
            return;
        }
        
        dfs(numbers, idx + 1, curX - numbers[idx])
        dfs(numbers, idx + 1, curX + numbers[idx]);
    }
    
    dfs(numbers,0,0);
    
    return answer;
}