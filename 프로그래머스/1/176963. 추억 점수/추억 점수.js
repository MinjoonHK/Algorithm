function solution(name, yearning, photo) {
    var answer = [];
    for(let i=0; i<photo.length; i++){
        let counter = 0;
        for(let j=0; j<photo[i].length;j++){
            if(name.includes(photo[i][j])){
                counter += yearning[name.indexOf(photo[i][j])];
            }
        }
        answer.push(counter);
    }
    return answer;
}