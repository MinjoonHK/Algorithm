const input = require("fs").readFileSync("/dev/stdin").toString().trim().split(" ");
const a = parseInt(input[0]);
const b = parseInt(input[1]);
console.log(a + b);
