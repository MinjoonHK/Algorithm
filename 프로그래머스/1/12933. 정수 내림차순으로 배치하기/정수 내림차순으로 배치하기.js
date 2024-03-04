function solution(n) {
    let numArr = String(n).split("").sort((a,b) => b-a);
    let answer = numArr.join("");
    return parseInt(answer);
}