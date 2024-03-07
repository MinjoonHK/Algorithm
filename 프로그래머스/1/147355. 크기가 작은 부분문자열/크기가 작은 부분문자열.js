function solution(t, p) {
    let arr = [];
    for(let i=0; i<=t.length - p.length;i++){
        arr.push(t.substring(i,i+p.length));
    }
    let answer = 0;
    
    for(let j=0; j<arr.length;j++){
        if(parseInt(p) >= parseInt(arr[j])){
            answer++;
        }
    }
    return answer;
}