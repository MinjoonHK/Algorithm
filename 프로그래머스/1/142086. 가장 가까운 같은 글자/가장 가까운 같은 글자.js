function solution(s) {
    let dict = new Map();
    let arr = s.split("");
    let answer = [];
    for(let i=0; i<arr.length; i++){
        if (dict.has(arr[i])){
            answer.push(i-dict.get(arr[i]));
            dict.set(arr[i],i);
        }
        else{
            dict.set(arr[i],i);
            answer.push(-1);
        }
    }
    return answer;
}