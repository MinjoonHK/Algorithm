function solution(s){
    let brackets = [];
    
    let arr = s.split("");
    
    for(let i=0; i<arr.length; i++){
        if(arr[i] == '('){
            brackets.push('(');
        }
        else if(arr[i] == ')'){
            if(brackets.length == 0){
                return false;
            }
            else{
                brackets.pop();
            }
        }
    }
    
    if(brackets.length > 0){
        return false;
    }

    return true;
}