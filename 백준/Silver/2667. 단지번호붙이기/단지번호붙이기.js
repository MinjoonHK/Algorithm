const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let N = 0;
let arr = [];
let answer = [];
let visited;
let dx = [-1, 1, 0, 0];
let dy = [0, 0, -1, 1];
let counter = 0;
rl.on("line", (line) => {
  if (inputLine == 0) {
    N = parseInt(line);
    visited = Array.from({ length: N }, () => Array(N).fill(0));
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
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr.length; j++) {
      if (!visited[i][j] && arr[i][j]) {
        dfs(i, j);
        answer.push(counter);
        counter = 0; //counter 초기화
      }
    }
  }
  console.log(answer.length);
  answer.sort((a, b) => a - b);
  console.log(answer.join("\n"));
}

function dfs(x, y) {
  visited[x][y] = true;
  arr[x][y] = 0;
  counter += 1;
  for (let i = 0; i < 4; i++) {
    let nx = x + dx[i];
    let ny = y + dy[i];
    if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
      continue;
    } else if (!visited[nx][ny] && arr[nx][ny]) {
      dfs(nx, ny);
    }
  }
}
