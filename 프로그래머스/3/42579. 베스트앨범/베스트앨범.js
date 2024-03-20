function solution(genres, plays) {
    let dict = new Map();
    for(let i=0; i<genres.length; i++){
        if(dict.has(genres[i])){
            dict.get(genres[i]).push([plays[i],i])
        }
        else{
            dict.set(genres[i], [[plays[i],i]]);
        }
    }
    let temp = [];
    for(let [key,value] of dict){
        let sum = value.reduce((sum, curValue) =>{
            return sum + curValue[0];
        },0);
        value.sort((a,b) => b[0] - a[0]);
        temp.push([key,sum]);
    }
    temp.sort((a,b) =>{
        return b[1] - a[1];
    });
    
    let answer = [];
    
    for(let i =0; i< temp.length; i++){
        let curGenre = dict.get(temp[i][0]);
        if(curGenre.length == 1){
            answer.push(curGenre[0][1]);
        }
        else{
            answer.push(curGenre[0][1]);
            answer.push(curGenre[1][1]);
        }
    }
    return answer;
}