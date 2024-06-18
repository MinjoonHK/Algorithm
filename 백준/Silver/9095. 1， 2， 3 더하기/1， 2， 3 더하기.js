const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let N = 0;
let inputLine = 0;
let answer = [];
rl.on("line", (line) => {
  if (inputLine == 0) {
    N = parseInt(line);
  }
  if (inputLine > 0 && inputLine <= N) {
    let temp = parseInt(line);
    let dp = Array.from({ length: temp + 1 }, () => 0);
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 4; //1 1 1, 1 2, 2 1, 3

    for (let i = 4; i <= temp; i++) {
      dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
    }
    answer.push(dp[temp]);
  }
  if (inputLine == N) {
    console.log(answer.join("\n"));
    process.exit();
  }
  inputLine++;
});
