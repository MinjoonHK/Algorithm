function solution(maps) {
    let N = maps.length;
    let M = maps[0].length;
    
    let visited = new Array(N).fill().map((v)=> new Array(M).fill(0));
    let dx = [-1,1,0,0];
    let dy = [0,0,-1,1];
    
    const bfs = (x,y) =>{
        let q = [];
        q.push([x,y]);
        visited[x][y] = 1;
        
        while(!q.length == 0){
            let [curX,curY] = q.shift();
            
            for(let i=0; i<4; i++){
                let nx = curX+dx[i];
                let ny = curY+dy[i];
                if(nx <0 || ny < 0 || nx >= N || ny >= M){
                    continue;
                }
                if(maps[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = visited[curX][curY] + 1;
                    q.push([nx,ny]);
                }
            }
        }
    }
    
    bfs(0,0);
    return visited[N-1][M-1] ? visited[N-1][M-1] : -1;

}