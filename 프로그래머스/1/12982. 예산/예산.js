function solution(d, budget) {
    var answer = 0;
    d = d.sort((a,b) => a-b);
    for(let i=0; i<d.length;i++){
        if(budget >= d[i]){
            budget-=d[i];
        }
        else{
            break;
        }
        answer++;
    }
    return answer;
}