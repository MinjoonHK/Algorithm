const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
rl.on("line", (line) => {
  if (inputLine == 0) {
    let N = parseInt(line);
    const dp = new Array(N + 1);
    dp[1] = 0;
    dp[2] = 1;
    dp[3] = Math.min(dp[1] + 1, dp[2] + 1);
    for (let i = 4; i <= N; i++) {
      if (i % 2 == 0) {
        dp[i] = Math.min(dp[i - 1] + 1, dp[i / 2] + 1);
      }
      if (i % 3 == 0) {
        dp[i] = Math.min(dp[i - 1] + 1, dp[i / 3] + 1);
      }
      if (i % 3 == 0 && i % 2 == 0) {
        dp[i] = Math.min(dp[i - 1] + 1, dp[i / 2] + 1, dp[i / 3] + 1);
      }
      if (i % 3 !== 0 && i % 2 !== 0) {
        dp[i] = dp[i - 1] + 1;
      }
    }
    console.log(dp[N]);
    process.exit();
  }
});
