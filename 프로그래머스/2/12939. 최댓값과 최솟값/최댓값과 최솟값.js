function solution(s) {
    var answer = '';
    let arr = s.split(" ").map((value) => parseInt(value));
    return `${Math.min(...arr)} ${Math.max(...arr)}`
}