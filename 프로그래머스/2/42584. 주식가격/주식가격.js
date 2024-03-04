function solution(prices) {
    var answer = [];
    for(let i=0; i<prices.length;i++){
        let counter = 0;
        for(let j=i+1; j<prices.length; j++){
            counter += 1;
            if(prices[i] > prices[j]){
                break;
            }
            
        }
        answer.push(counter);
    }
    return answer;
}
