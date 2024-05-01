const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let N = 0;
let arr = [];
rl.on("line", (line) => {
  if (inputLine == 0) {
    N = parseInt(line);
  }
  if (inputLine > 0 && inputLine <= N) {
    arr.push(line.split(" ").map((el) => parseInt(el)));
  }
  if (inputLine == N) {
    let dp = new Array(N).fill(0);
    for (let i = 0; i < N; i++) {
      let [p, t] = arr[i];
      if (i + p > N) continue;
      dp[i] = dp[i] + t;
      for (let j = i + p; j < N; j++) {
        dp[j] = Math.max(dp[j], dp[i]);
      }
    }
    console.log(Math.max(...dp));
    process.exit();
  }
  inputLine++;
});
