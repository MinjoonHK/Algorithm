let readLine = require("readline");

let rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let str;
let inputLine = 0;
rl.on("line", (line) => {
  if (inputLine == 0) {
    str = line;
  }
  if (inputLine == 1) {
    let N = parseInt(line);
    console.log(str[N - 1]);
    process.exit();
  }
  inputLine++;
});
