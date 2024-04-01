function solution(food) {
    let temp ="";
    for(let i=1; i<food.length;i++){
        if(food[i] <2){
            continue;
        }
        else{
            if(food[i] % 2 ==0){
                for(let j=0; j<food[i] /2 ; j++){
                    temp += String(i);
                }
            }
            else{
                for(let j=0; j<(food[i] -1) / 2; j++){
                    temp += String(i);
                }
            }
        }
    }
    
    let reverse = temp.split("").reverse().join("");
    return temp + "0" + reverse;
}