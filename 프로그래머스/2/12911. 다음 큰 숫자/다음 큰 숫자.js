function solution(n) {
    let temp = n;
    while(true){
        let og = temp.toString(2).split("").filter((value) => value == '1').length;
        let next = (n+1).toString(2).split("").filter((value) => value == '1').length;
        if(og == next){
            return n+1;
        }
        n+=1;
    }
}