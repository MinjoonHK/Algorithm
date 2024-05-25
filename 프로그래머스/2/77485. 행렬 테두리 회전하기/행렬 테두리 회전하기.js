function solution(rows, columns, queries) {
    let graph = Array.from({length:rows},() => []);
    let counter = 1;
    let answer = [];
    for(let i=0; i<rows; i++){
        for(let j=0; j<columns; j++){
            graph[i].push(counter);
            counter++;
        }
    }
    
    queries.forEach((query) =>{
        let [x1,y1,x2,y2] = query.map((pos) => pos-1); //1 1 4 3
        let queue = [];
        for (let i = 0; i < y2 - y1; i++) queue.push(graph[x1][y1+i]); //위 오
        for (let i = 0; i < x2 - x1; i++) queue.push(graph[x1+i][y2]); // 오 아래
        for (let i = 0; i < y2 - y1; i++) queue.push(graph[x2][y2-i]); // 아래 왼
        for (let i = 0; i < x2 - x1; i++) queue.push(graph[x2-i][y1]); // 왼 위
        queue.unshift(queue.pop());
        answer.push(Math.min(...queue));
        
        for (let i = 0; i < y2 - y1; i++) graph[x1][y1+i] = queue.shift(); //위 오
        for (let i = 0; i < x2 - x1; i++) graph[x1+i][y2] = queue.shift(); // 오 아래
        for (let i = 0; i < y2 - y1; i++) graph[x2][y2-i] = queue.shift(); // 아래 왼
        for (let i = 0; i < x2 - x1; i++) graph[x2-i][y1] = queue.shift(); // 왼 위
    })
    
    return answer;
}