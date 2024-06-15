const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
rl.on("line", (line) => {
  if (inputLine == 0) {
    let number = parseInt(line);
    const dp = Array.from(new Array(number + 1), () => new Array(10));
    dp[1] = [0, 1, 1, 1, 1, 1, 1, 1, 1, 1];
    dp[2] = [1, 1, 2, 2, 2, 2, 2, 2, 2, 1];

    for (let i = 3; i <= number; i++) {
      for (let j = 0; j < 10; j++) {
        if (j == 0) {
          dp[i][j] = dp[i - 1][j + 1] % 1000000000;
        } else if (j >= 1 && j <= 8) {
          dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
        } else {
          dp[i][j] = dp[i - 1][j - 1] % 1000000000;
        }
      }
    }

    let sum = 0;
    for (let j = 0; j < 10; j++) {
      sum += dp[number][j];
    }
    console.log(sum % 1000000000);
    process.exit();
  }
});
