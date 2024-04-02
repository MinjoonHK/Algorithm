let readLine = require("readline");

let rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let N;
let arr = [];
let inputLine = 0;
rl.on("line", (line) => {
  if (inputLine == 0) {
    N = parseInt(line);
  }
  if (inputLine >= 1 && inputLine <= N) {
    let temp = line.split(" ").map((el) => parseInt(el));
    arr.push(temp);
  }
  if (inputLine == N) {
    for (let i = arr.length - 2; i >= 0; i--) {
      for (j = 0; j < arr[i].length; j++) {
        arr[i][j] += Math.max(arr[i + 1][j], arr[i + 1][j + 1]);
      }
    }
    console.log(arr[0][0]);
    process.exit();
  }

  inputLine++;
});
