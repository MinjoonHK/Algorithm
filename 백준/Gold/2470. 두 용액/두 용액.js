let readLine = require("readline");

let rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let N;
let arr;

let inputNumber = 0;

rl.on("line", (line) => {
  if (inputNumber == 0) {
    N = parseInt(line);
  } else if (inputNumber == 1) {
    arr = line.split(" ").map((el) => parseInt(el));
    rl.close();
  }
  inputNumber += 1;
});

rl.on("close", () => {
  arr.sort((a, b) => a - b);
  let temp = Infinity;
  let answerLo = 0;
  let answerHi = 0;
  let lo = 0;
  let hi = N - 1;
  while (lo !== hi) {
    let sum = arr[lo] + arr[hi];
    if (Math.abs(sum) < temp) {
      temp = Math.abs(sum);
      answerLo = arr[lo];
      answerHi = arr[hi];
    }
    if (sum == 0) {
      break;
    } else if (sum < 0) {
      lo += 1;
    } else if (sum > 0) {
      hi -= 1;
    }
  }
  console.log(answerLo, answerHi);
  process.exit();
});
