function solution(n) {
    var answer = 0;
    answer += Math.sqrt(n);
    if(!Number.isInteger(answer)){
        return -1;
    }
    return (answer +1)** 2;
}