const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let arr;
let visited;
let N;
let M;
let answer = 0;
rl.on("line", (line) => {
  if (inputLine == 0) {
    [N, M] = line.split(" ").map((el) => parseInt(el));
    arr = Array.from({ length: N + 1 }, () => []);
    visited = Array.from({ length: N + 1 }, () => false);
  }
  if (inputLine > 0 && inputLine <= M) {
    let [a, b] = line.split(" ").map((el) => parseInt(el));
    arr[a].push(b);
    arr[b].push(a);
  }
  if (inputLine == M) {
    solution();
    console.log(answer);
    process.exit();
  }
  inputLine++;
});

function solution() {
  for (let i = 1; i < visited.length; i++) {
    if (!visited[i]) {
      dfs(i);
      answer++;
    }
  }
}

function dfs(node) {
  visited[node] = true;
  for (const next of arr[node]) {
    if (!visited[next]) {
      dfs(next);
    }
  }
}
