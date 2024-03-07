function solution(answers) {
    
    let person1 = [1,2,3,4,5];
    let person2 = [2,1,2,3,2,4,2,5];
    let person3 = [3,3,1,1,2,2,4,4,5,5];
    let score = [0,0,0];
    
    for(let i=0; i<answers.length;i++){
        if(answers[i] == person1[i % person1.length]){
            score[0] += 1;
        }
        if(answers[i] == person2[i % person2.length]){
            score[1] += 1;
        }
        if(answers[i] == person3[i % person3.length]){
            score[2] += 1;
        }
    }
    
    let maxScore = Math.max(...score);
    
    let answer = [];
    
    for(let i=1; i<=score.length;i++){
        if(score[i-1] == maxScore){
            answer.push(i);
        }
    }
    return answer;
    
}