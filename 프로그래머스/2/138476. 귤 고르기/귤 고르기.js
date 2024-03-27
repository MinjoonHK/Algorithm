function solution(k, tangerine) {
    let dict = new Map();
    
    for(let i=0; i<tangerine.length; i++){
        if(dict.has(tangerine[i])){
            dict.set(tangerine[i],dict.get(tangerine[i])+1);
        }
        else{
            dict.set(tangerine[i],1);
        }
    }
    
    let arr = [...dict];
    arr.sort((a,b) => b[1]-a[1]);
    let answer = 0;
    for(let i=0; i<arr.length; i++){
        
        answer += 1;
        k -= parseInt(arr[i][1]);
        if(k <= 0){
            break;
        }
    }
    
    return answer;
}