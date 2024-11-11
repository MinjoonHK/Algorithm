let input = require("fs").readFileSync("/dev/stdin").toString().split("\n");
let numbers = input[1].split(" ").map((el) => parseInt(el));

console.log(Math.min(...numbers), Math.max(...numbers));