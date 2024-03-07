function solution(n) {
    let num = n.toString(3).split("").map((value) => parseInt(value));
    let answer = 0;
    for(let i =0; i<num.length;i++){
        answer += num[i] * (3**i);
    }
    
    return answer;
}