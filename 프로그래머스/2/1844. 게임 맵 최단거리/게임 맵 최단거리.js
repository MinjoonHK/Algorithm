function solution(maps) {
    let N = maps.length;
    let M = maps[0].length;
    let visited = Array.from(Array(N), () => Array(M).fill(0));
    let dx = [-1,1,0,0];
    let dy = [0,0,-1,1];
    function bfs(x,y){
        let q = [];
        q.push([x,y]);
        while(q.length !=0){
            let qPoll = q.shift();
            let curX = qPoll[0];
            let curY = qPoll[1];
            for(let i=0; i<4; i++){
                let nx = curX + dx[i];
                let ny = curY + dy[i];
                
                if(nx >= N || ny >= M || nx < 0 || ny < 0){
                    continue;
                }
                if(!visited[nx][ny] && maps[nx][ny] ==1){
                    maps[nx][ny] = maps[curX][curY] + 1;
                    visited[nx][ny] = true;
                    q.push([nx,ny]);
                }
            }
        }
    }
    bfs(0,0);
    return maps[N-1][M-1] <= 1 ? -1 : maps[N-1][M-1];
}