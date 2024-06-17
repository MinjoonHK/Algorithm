const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
rl.on("line", (line) => {
  if (inputLine == 0) {
    let N = parseInt(line);
    let currentNum = 1;
    let sequence = Array.from({ length: N }, (v, i) => i);
    let answer = Array.from({ length: N }, () => 0);
    while (sequence.length != 0) {
      for (let i = 0; i < currentNum; i++) {
        sequence.push(sequence.shift());
      }
      answer[sequence.shift()] = currentNum;
      currentNum++;
    }
    console.log(answer.flat().join(" "));
    process.exit();
  }
});
