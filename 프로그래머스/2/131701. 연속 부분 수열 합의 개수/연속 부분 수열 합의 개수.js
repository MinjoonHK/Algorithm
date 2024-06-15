function solution(elements) {
    var answer = new Set();
    let newElements = elements.concat(elements);
    for(let i=1; i<= elements.length; i++){
        for(let j=0; j<elements.length; j++){
            let temp = newElements.slice(j,j+i);
            let sum = temp.reduce((acc,cur) => acc+cur, 0);
            answer.add(sum);
        }
    }
    return answer.size;
}