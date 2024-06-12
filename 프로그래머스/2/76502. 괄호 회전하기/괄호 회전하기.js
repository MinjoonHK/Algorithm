function solution(s) {
    var answer = 0;
    let arr = s.split("");
    for(let i=0; i<arr.length-1; i++){
        if(check(arr)){
            answer +=1;
        }
        arr.push(arr.shift());
    }
    return answer;
}

function check(arr){
    let stack = [];
    for(let i=0; i<arr.length; i++){
        if(arr[i] == "[" || arr[i] == "{" || arr[i] == "("){
            stack.push(arr[i]);
        }
        else{
            if(stack.length == 0){
                return false;
            }
            else if(arr[i] == "}"){
                if(stack.pop() != "{"){
                    return false;
                }
            }
            else if(arr[i] == "]"){
                if(stack.pop() != "["){
                    return false;
                }
            }
            else if(arr[i] == ")"){
                if(stack.pop() != "("){
                    return false;
                }
            }
        }
    }
    return stack.length == 0 ? true : false;
}