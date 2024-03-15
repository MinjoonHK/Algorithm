function solution(s) {
    let answer = 0;


    for(let i=0; i<s.length; i++) {

        let stack = [];


        for(let j=0; j<s.length; j++) {

            if(s[j] == ')' && stack[stack.length-1] == '(' 
               || s[j] == ']' && stack[stack.length-1] == '[' 
               || s[j] == '}' && stack[stack.length-1] == '{') {
                stack.pop();
            } else {
                stack.push(s[j]);
            }
        }


        if(stack.length == 0) {
            answer += 1;
        }


        s = s.slice(1) + s[0];
    }

    return answer;
}