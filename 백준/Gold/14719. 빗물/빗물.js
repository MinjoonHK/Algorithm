const readLine = require("readline");

const rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let H = 0;
let W = 0;
let answer = 0;
let rainFall;
rl.on("line", (line) => {
  if (inputLine == 0) {
    [H, W] = line.split(" ").map((el) => parseInt(el));
    rainFall = Array.from({ length: H }, () =>
      Array.from({ length: W }, () => 0)
    );
  }
  if (inputLine == 1) {
    let userInput = line.split(" ").map((el) => parseInt(el));
    for (let i = 0; i < userInput.length; i++) {
      for (let j = 0; j < userInput[i]; j++) {
        rainFall[j][i] = 1;
      }
    }

    for (let i = 0; i < H; i++) {
      let flag = false;
      let countEmpty = 0;
      for (let j = 0; j < W; j++) {
        if (!flag && rainFall[i][j] == 1) {
          flag = true;
        }
        if (flag) {
          if (rainFall[i][j] == 0) {
            countEmpty += 1;
          }
          if (rainFall[i][j] == 1) {
            answer += countEmpty;
            countEmpty = 0;
          }
        }
      }
    }
    console.log(answer);
    process.exit();
  }
  inputLine++;
});
