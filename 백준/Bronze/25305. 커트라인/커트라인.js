const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 1;
let arr;
let N, M;
rl.on("line", (line) => {
  if (inputLine == 1) {
    let input = line.split(" ");
    N = parseInt(input[0]);
    M = parseInt(input[1]);
  }
  if (inputLine == 2) {
    arr = line.split(" ").map((number) => parseInt(number));
    arr.sort((a, b) => b - a);
    console.log(arr[M - 1]);
    process.exit();
  }
  inputLine++;
});
