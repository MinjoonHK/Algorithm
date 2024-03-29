function solution(babbling) {
    let baby = ["aya","ye","woo","ma"];
    let answer = 0;
    for(let i=0; i<babbling.length; i++){
        let temp = "";
        for(let j=0; j<baby.length;j++){
            if(babbling[i].includes(baby[j])){
                temp += baby[j];
            }
        }
        
        if(babbling[i].length == temp.length){
            answer+=1;
        }
    }
    return answer;
}