const fs = require('fs');
const input = fs.readFileSync("./dev/stdin").toString().trim().split("\n");
const N = Number(input[0])
const formula = input[1].split('');

let answer = -Infinity;

const signCnt = Math.floor(N / 2)

const Bracket = [];
for (let i = 0; i < 1 << signCnt; i++) {
  if (checkBracket(i)) {
    Bracket.push(i)
  }
}

Bracket.forEach(b => {
  const stack = [];
  let bracket = false;
  formula.forEach((f, i) => {
    if (isSign(f)) {
      if (isBracket(i, b)) {// 괄호일때.
        bracket = true;
      }
      stack.push(f)
    } else {
      if (bracket) {
        const sign = stack.pop();
        const prev = stack.pop();
        const now = f;
        const result = calc(prev, sign, now)
        stack.push(result)
        bracket = false;
      } else {
        stack.push(Number(f))
      }
    }
  })
  let res = +stack.shift();
  while (stack.length > 0) {
    const sign = stack.shift();
    const next = stack.shift();
    switch (sign) {
      case '+':
        res += Number(next);
        break;
      case '-':
        res -= Number(next);
        break;
      case '*':
        res *= Number(next);
        break;
    }
  }
  if (res > answer) answer = res;
})
console.log(answer)

function checkBracket(num) {
  let prev = 0;
  let loc = 0;
  let flag = true;
  let temp = num;
  while (temp > 0 && flag) {
    const now = temp & (1 << loc);
    if (prev == 1 && now == 1) {
      flag = false;
    } else {
      prev = now;
    }
    temp = temp >> 1;
  }
  return flag;
}

function isSign(c) {
  if (c == '+' || c == '-' || c == '*') {
    return true;
  }
  return false;
}

function isBracket(index, base) {
  const newIndex = (index - 1) / 2;
  if (base & (1 << newIndex)) { //괄호일때
    return true;
  } else { // 아닐 때 
    return false;
  }
}

function calc(prev, sign, now) {
  let ret;
  switch (sign) {
    case '+':
      ret = Number(prev) + Number(now);
      break;
    case '-':
      ret = Number(prev) - Number(now);
      break;
    case '*':
      ret = Number(prev) * Number(now);
      break;
  }
  return ret;
}
