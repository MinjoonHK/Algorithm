const readLine = require("readline");

const rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let arr = [];
let visited;
let N = 0;
let M = 0;
let answer = [];
rl.on("line", (line) => {
  if (inputLine == 0) {
    [N, M] = line.split(" ").map((el) => parseInt(el));
    visited = Array.from({ length: N }, () => false);
    dfs(0);
    console.log(answer.map((arr) => arr.join(" ")).join("\n"));
    process.exit();
  }
});

function dfs(depth) {
  if (depth == M) {
    answer.push([...arr]);
    return;
  }

  for (let i = 0; i < N; i++) {
    if (visited[i] == true) continue;
    visited[i] = true;
    arr.push(i + 1);
    dfs(depth + 1);
    arr.pop(i + 1);
    visited[i] = false;
  }
}
