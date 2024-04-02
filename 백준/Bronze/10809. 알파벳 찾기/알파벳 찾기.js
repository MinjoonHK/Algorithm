let readLine = require("readline");

let rl = readLine.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let alphabets = [
  "a",
  "b",
  "c",
  "d",
  "e",
  "f",
  "g",
  "h",
  "i",
  "j",
  "k",
  "l",
  "m",
  "n",
  "o",
  "p",
  "q",
  "r",
  "s",
  "t",
  "u",
  "v",
  "w",
  "x",
  "y",
  "z",
];
let answer = Array(alphabets.length).fill(-1);
rl.on("line", (line) => {
  let str = line;
  for (let i = 0; i < alphabets.length; i++) {
    answer[i] = str.indexOf(alphabets[i]);
  }
  console.log(answer.join(" "));
  process.exit();
});
