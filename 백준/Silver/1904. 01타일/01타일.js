let readLine = require("readline");

let rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let N;
rl.on("line", (line) => {
  N = parseInt(line);
  rl.close();
});

rl.on("close", () => {
  let dp = [0, 1, 2];
  for (let i = 3; i <= N; i++) {
    dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
  }
  console.log(dp[N] % 15746);
});
