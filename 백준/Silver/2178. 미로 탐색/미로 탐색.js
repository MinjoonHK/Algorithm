const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let N = 0;
let M = 0;
let arr = [];
let visited;
let dx = [-1, 1, 0, 0];
let dy = [0, 0, -1, 1];
rl.on("line", (line) => {
  if (inputLine == 0) {
    let userInput = line.split(" ").map((el) => parseInt(el));
    N = userInput[0];
    M = userInput[1];
    visited = Array.from({ length: N }, () =>
      Array.from({ length: M }, () => false)
    );
  }
  if (inputLine > 0 && inputLine <= N) {
    arr.push(line.split("").map((el) => parseInt(el)));
  }
  if (inputLine == N) {
    solution();
    process.exit();
  }
  inputLine++;
});

function solution() {
  bfs(0, 0);
  console.log(arr[N - 1][M - 1]);
  process.exit();
}

function bfs(x, y) {
  let queue = [];
  queue.push([x, y]);
  visited[x][y] = true;
  while (!queue.length == 0) {
    let [curX, curY] = queue.shift();
    for (let i = 0; i < 4; i++) {
      let nx = curX + dx[i];
      let ny = curY + dy[i];
      if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
        continue;
      }
      if (!visited[nx][ny] && arr[nx][ny] == 1) {
        queue.push([nx, ny]);
        arr[nx][ny] = arr[curX][curY] + 1;
      }
    }
  }
}
