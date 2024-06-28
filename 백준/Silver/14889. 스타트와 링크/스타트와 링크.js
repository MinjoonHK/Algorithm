const readLine = require("readline");

const rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let N = 0;
let board = [];
let visited;
let minScore = Infinity;
rl.on("line", (line) => {
  if (inputLine == 0) {
    N = parseInt(line);
    visited = Array.from({ length: N }, () => false);
  }
  if (inputLine > 0 && inputLine <= N) {
    board.push(line.split(" ").map((el) => parseInt(el)));
  }
  if (inputLine == N) {
    dfs(0, 0);
    console.log(minScore);
    process.exit();
  }
  inputLine++;
});

function dfs(depth, startIdx) {
  if (depth == N / 2) {
    let start = [];
    let link = [];
    let startSum = 0;
    let linkSum = 0;
    for (let i = 0; i < N; i++) {
      if (visited[i]) start.push(i);
      else link.push(i);
    }

    for (let i = 0; i < N / 2; i++) {
      for (let j = i + 1; j < N / 2; j++) {
        startSum += board[start[i]][start[j]] + board[start[j]][start[i]];
        linkSum += board[link[i]][link[j]] + board[link[j]][link[i]];
      }
    }
    minScore = Math.min(minScore, Math.abs(startSum - linkSum));
    return;
  }

  for (let i = startIdx; i < N; i++) {
    if (visited[i]) continue;
    visited[i] = true;
    dfs(depth + 1, i + 1);
    visited[i] = false;
  }
}
