function solution(priorities, location) {
    let maxVal = Math.max(...priorities);
    let newArr = priorities.map((value, idx) => [value, idx]);
    let counter = 1;
    
    while(true){
        if(newArr[0][0] == maxVal){
            if(newArr[0][1] == location){
                return counter;
            }
            else{
                newArr.shift();
                priorities.splice(priorities.indexOf(maxVal),1);
                maxVal = Math.max(...priorities);
                counter++;
            }
        }
        else{
            newArr.push(newArr.shift());
        }
    }
}