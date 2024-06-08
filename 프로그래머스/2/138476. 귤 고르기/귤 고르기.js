function solution(k, tangerine) {
    let answer = 0;
    let map = new Map();
    for(let i=0; i<tangerine.length; i++){
        if(map.get(tangerine[i]) == undefined){
            map.set(tangerine[i],1);
        }
        else{
            map.set(tangerine[i],map.get(tangerine[i]) +1);
        }
    }
    let mapToArray = Array.from(map);
    mapToArray.sort((a,b) => b[1] - a[1]);
    for(let i=0; i<mapToArray.length; i++){
        if(mapToArray[i][1] >= k){
            answer += 1;
            break;
        }
        else{
            k -= mapToArray[i][1];
            answer += 1;
        }
    }
    return answer;
}