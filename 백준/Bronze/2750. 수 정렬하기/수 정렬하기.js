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
    arr.push(line);
  }
  if (inputLine == N) {
    arr.sort((a, b) => a - b);
    for (let i = 0; i < arr.length; i++) {
      console.log(arr[i]);
    }
    process.exit();
  }
  inputLine++;
});
