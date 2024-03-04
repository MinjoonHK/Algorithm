function solution(arr) {
    let minNum = arr.indexOf(Math.min(...arr));
    arr.splice(minNum,1);
    if(arr.length ==0){
        arr.push(-1)
    }
    return arr;
}