function solution(k, dungeons) {
    let answer = 0;
    let visited = Array.from({length:dungeons.length}, ()=> false);
    function dfs(depth, hp){
        for(let i=0; i<dungeons.length; i++){
            if(!visited[i] && dungeons[i][0] <= hp){
                visited[i] = true;
                dfs(depth+1, hp-dungeons[i][1]);
                visited[i] = false;
            }
        }
        answer = Math.max(answer,depth);
    }
    dfs(0,k);
    return answer;
}

