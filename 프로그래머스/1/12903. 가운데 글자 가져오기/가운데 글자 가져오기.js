function solution(s) {
    let strArr = s.split("");
    if(s.length % 2 ==0){
        return strArr[Math.floor(s.length/2) -1] + strArr[Math.floor(s.length/2)];
    }
    else{
        return strArr[Math.floor(s.length/2)];
    }
}