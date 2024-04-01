let readLine = require("readline");

let rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let N;
let arr;

rl.on("line", (line) => {
  if (inputLine == 0) {
    N = parseInt(line);
  }
  if (inputLine == 1) {
    arr = line.split(" ").map((el) => parseInt(el));

    let result = arr[0];

    for (let i = 1; i < arr.length; i++) {
      arr[i] = Math.max(arr[i - 1] + arr[i], arr[i]);
      result = Math.max(result, arr[i]);
    }
    console.log(result);
    process.exit();
  }
  inputLine++;
});
