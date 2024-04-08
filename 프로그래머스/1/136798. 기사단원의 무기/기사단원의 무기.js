function solution(number, limit, power) {
    let weights = [];
    for(let i=1; i<=parseInt(number); i++){
        let temp = [];
        for(let j=1; j<=Math.sqrt(i); j++){
            if(i % j == 0){
                temp.push(j);
                if(i / j !== j){
                    temp.push(i/j);
                }
            }
            
        }
        if(temp.length > limit){
            weights.push(power);
        }
        else{
            weights.push(temp.length);
        }
    }
    let answer = weights.reduce((acc,cur) => acc+cur,0);
    return answer;
}