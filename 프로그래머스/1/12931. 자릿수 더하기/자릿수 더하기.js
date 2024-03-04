function solution(n)
{
    var answer = 0;

    let digits = n.toString();
    
    for(let i =0; i<digits.length; i++){
        answer += parseInt(digits[i]);
    }
    
    

    return answer;
}