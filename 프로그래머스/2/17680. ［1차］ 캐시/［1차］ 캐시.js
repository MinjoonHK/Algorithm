function solution(cacheSize, cities) {
    var answer = 0;
    let queue = [];
    if(cacheSize == 0){
        return cities.length * 5;
    }
    for(let i of cities){
        if(queue.includes(i.toUpperCase())){
            queue.splice(queue.indexOf(i.toUpperCase()),1);
            queue.push(i.toUpperCase());
            answer+=1;
        }
        else{
            if(queue.length == cacheSize){
                queue.shift();
            }
            queue.push(i.toUpperCase());
            answer+=5;
        }
        
    }
    return answer;
}