const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
const [N, M] = input[0].split(" ").map(Number);
const data = input.slice(1);

const list1 = data.slice(0, N);
const list2 = data.slice(N, N + M);

const hashMap = new Map();
for (const name of list1) {
  hashMap.set(name, true); 
}

const result = [];
for (const name of list2) {
  if (hashMap.has(name)) {
    
    result.push(name);
  }
}
result.sort();

console.log(result.length);
for (const name of result) {
  console.log(name);
}
