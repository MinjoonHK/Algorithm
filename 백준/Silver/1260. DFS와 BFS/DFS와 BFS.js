let readLine = require("readline");

let rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let N, M, V;
let arr;
let inputLine = 0;
let visited1;
let visited2;
rl.on("line", function (line) {
  if (inputLine == 0) {
    let cmd = line.split(" ").map((value) => parseInt(value));
    N = cmd[0];
    M = cmd[1];
    V = cmd[2];
    arr = Array(N + 1)
      .fill()
      .map(() => Array());
    visited1 = Array(N + 1).fill(false);
    visited2 = Array(N + 1).fill(false);
  } else if (inputLine >= 1 && inputLine <= M) {
    let cmd = line.split(" ").map((value) => parseInt(value));
    arr[cmd[0]].push(cmd[1]);
    arr[cmd[1]].push(cmd[0]);
  }
  if (inputLine == M) {
    let answerBfs = [];
    let bfs = (v) => {
      visited1[v] = true;
      let Queue = [];
      Queue.push(v);
      while (!Queue.length == 0) {
        let node = Queue.shift();
        answerBfs.push(node);
        arr[node].sort((a, b) => a - b);
        for (let i = 0; i < arr[node].length; i++) {
          if (!visited1[arr[node][i]]) {
            Queue.push(arr[node][i]);
            visited1[arr[node][i]] = true;
          }
        }
      }
    };
    let answerDfs = [];
    let dfs = (v) => {
      visited2[v] = true;
      answerDfs.push(v);
      arr[v].sort((a, b) => a - b);
      for (let i = 0; i < arr[v].length; i++) {
        if (!visited2[arr[v][i]]) {
          dfs(arr[v][i]);
        }
      }
    };
    bfs(V);
    dfs(V);
    console.log(answerDfs.join(" "));
    console.log(answerBfs.join(" "));
    process.exit();
  }
  inputLine++;
});
