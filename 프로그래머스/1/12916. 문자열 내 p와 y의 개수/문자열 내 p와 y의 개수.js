function solution(s){
    var answer = true;
    
    let countP = 0;
    let countY = 0;
    
    for(let i=0; i<s.length;i++){
        if(s[i] == "p" || s[i] == "P"){
            countP += 1;
        }
        else if(s[i] == "y" || s[i] == "Y"){
            countY += 1;
        }
    }
    
    if(countP == countY){
        return true;
    }
    else{
        return false;
    }
}