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
    let temp = line.split(" ").map((el) => parseInt(el));
    let arr = temp.slice(1);
    let count = 0;
    let lineUp = [];
    for (const child of arr) {
      for (let i = 0; i < lineUp.length; i++) {
        if (lineUp[i] > child) {
          count++;
        }
      }
      lineUp.push(child);
      lineUp.sort((a, b) => a - b);
    }
    answer.push([inputLine, count]);
  }
  if (inputLine == N) {
    for (let i = 0; i < answer.length; i++) {
      console.log(answer[i].join(" "));
    }
    process.exit();
  }
  inputLine++;
});
