function solution(people, limit) {
    people.sort((a,b) => a-b);
    let answer = 0;
    
    while(people.length > 0){
        if(people.length == 1){
            answer++;
            break;
        }
        
        if(people[0] + people[people.length-1] <= limit){
            people.shift();
            people.pop();
            answer++;
        }
        else if(people[0] + people[people.length-1] > limit){
            people.pop();
            answer++;
        }
    }
    
    return answer;
}