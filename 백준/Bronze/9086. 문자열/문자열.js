let readLine = require("readline");

let rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let N;
let inputLine = 0;
rl.on("line", (line) => {
  if (inputLine == 0) {
    N = parseInt(line);
  } else if (inputLine >= 1 && inputLine <= N) {
    let str = line;
    console.log(str[0] + str[str.length - 1]);
  }
  if (inputLine == N) {
    process.exit();
  }
  inputLine++;
});
