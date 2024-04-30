const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let arr = [];
let N = 0;
let answer = "";
rl.on("line", (line) => {
  if (inputLine == 0) {
    N = parseInt(line);
  }
  if (inputLine > 0 && inputLine <= N) {
    arr.push(line.split(" ").map((el) => parseInt(el)));
  }
  if (inputLine == N) {
    arr.sort((a, b) => {
      if (a[0] == b[0]) {
        return a[1] - b[1];
      }
      return a[0] - b[0];
    });
    for (let i = 0; i < arr.length; i++) {
      answer += arr[i].join(" ") + "\n";
    }
    console.log(answer);
    process.exit();
  }
  inputLine++;
});
