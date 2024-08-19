function solution(s) {
    let answer = [];
    let str = s.replace(/{/g, "[").replace(/}/g,"]");
    let arr = JSON.parse(str);
    arr.sort((a,b) =>{
        return a.length - b.length;
    });
    for(let i = 0; i< arr.length; i++){
        for(let j=0; j<arr[i].length; j++){
            if(answer.includes(arr[i][j])){
                continue;
            }
            else{
                answer.push(arr[i][j]);
            }
        }
    }
    console.log(arr);
    return answer;
}