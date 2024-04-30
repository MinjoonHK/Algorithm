const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 1;
let arr = [];
rl.on("line", (line) => {
  if (inputLine >= 1 && inputLine <= 5) {
    arr.push(parseInt(line));
  }
  if (inputLine == 5) {
    arr.sort((a, b) => a - b);
    let avg = arr.reduce((acc, cur) => acc + cur, 0) / 5;
    let mid = arr[2];
    console.log(avg);
    console.log(mid);
    process.exit();
  }
  inputLine++;
});
