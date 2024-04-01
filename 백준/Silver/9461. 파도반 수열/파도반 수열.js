let readLine = require("readline");

let rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});
let inputLine = 0;
let T;
rl.on("line", (line) => {
  if (inputLine == 0) {
    T = parseInt(line);
  } else {
    dp = [1, 1, 1, 2, 2, 3, 4, 5, 7, 9];
    let input = parseInt(line);
    if (input < 10) {
      console.log(dp[input - 1]);
    } else {
      for (let i = 10; i <= input; i++) {
        dp[i] = dp[i - 2] + dp[i - 3];
      }
      console.log(dp[input - 1]);
    }
  }
  if (inputLine == T) process.exit();
  inputLine++;
});
