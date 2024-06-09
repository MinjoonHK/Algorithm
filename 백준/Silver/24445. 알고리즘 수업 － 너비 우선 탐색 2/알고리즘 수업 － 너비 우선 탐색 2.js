const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let N = 0;
let M = 0;
let R = 0;
let arr;
let visited;
let counter = 1;
rl.on("line", (line) => {
  if (inputLine == 0) {
    let userInput = line.split(" ").map((el) => parseInt(el));
    N = userInput[0];
    M = userInput[1];
    R = userInput[2];
    arr = Array.from({ length: N + 1 }, () => []);
    visited = Array.from({ length: N + 1 }, () => 0);
  }
  if (inputLine > 0 && inputLine <= M) {
    let [a, b] = line.split(" ").map((el) => parseInt(el));
    arr[a].push(b);
    arr[b].push(a);
  }
  if (inputLine == M) {
    arr.map((v) => v.sort((a, b) => b - a));
    solution();
    process.exit();
  }
  inputLine++;
});

function solution() {
  bfs(R);
  let answer = visited.splice(1);
  console.log(answer.join("\n"));
}

function bfs(v) {
  let queue = [];
  queue.push(v);
  visited[v] = 1;
  while (!queue.length == 0) {
    let node = queue.shift();
    for (const next of arr[node]) {
      if (!visited[next]) {
        queue.push(next);
        visited[next] = ++counter;
      }
    }
  }
}
