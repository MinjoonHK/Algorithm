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
    for (let i = 1; i < arr.length; i++) {
      arr[i][0] = arr[i][0] + Math.min(arr[i - 1][1], arr[i - 1][2]);
      arr[i][1] = arr[i][1] + Math.min(arr[i - 1][0], arr[i - 1][2]);
      arr[i][2] = arr[i][2] + Math.min(arr[i - 1][0], arr[i - 1][1]);
    }
    console.log(Math.min(...arr[N - 1]));
    process.exit();
  }

  inputLine++;
});
