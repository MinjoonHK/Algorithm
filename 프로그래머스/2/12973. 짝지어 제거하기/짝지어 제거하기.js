function solution(s)
{
    let temp = s.split("");
    let stack = [];
    for(const word of temp){
        if(stack.length == 0 || stack[stack.length -1] != word){
            stack.push(word);
        }
        else{
            stack.pop();
        }
    }
    return stack.length == 0 ? 1 : 0;
}