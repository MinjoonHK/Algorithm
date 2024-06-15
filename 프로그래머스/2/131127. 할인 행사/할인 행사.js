function solution(want, number, discount) {
    var answer = 0;
    let wantList = [];
    for(let i=0; i<want.length; i++){
        for(let j=0; j< number[i]; j++){
            wantList.push(want[i]);
        }
    }
    wantList.sort();
    for(let i=0; i<=discount.length - 10; i++){
        let slice = discount.slice(i,i+10).sort();
        if(JSON.stringify(wantList) == JSON.stringify(slice)){
            answer+=1;
        }
    }
    return answer;
}