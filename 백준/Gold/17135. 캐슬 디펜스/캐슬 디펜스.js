const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let N = 0,
  M = 0,
  D = 0;

const board = [];
rl.on("line", (line) => {
  if (inputLine === 0) {
    let temp = line.split(" ").map((num) => parseInt(num));
    N = temp[0];
    M = temp[1];
    D = temp[2];
  }
  if (inputLine > 0 && inputLine <= N) {
    const row = line.split(" ").map((num) => parseInt(num));
    board.push(row);
  }
  if (inputLine === N) {
    console.log(maxEnemies(N, M, D, board));
    process.exit();
  }
  inputLine++;
});

function calculateDistance(ax, ay, bx, by) {
  return Math.abs(ax - bx) + Math.abs(ay - by);
}

function simulate(N, M, D, board, archers) {
  let enemies = 0;
  let tempBoard = board.map((row) => [...row]);

  for (let turn = 0; turn < N; turn++) {
    let targets = new Set();

    archers.forEach((archer) => {
      let target = null;
      let minDistance = D + 1;

      for (let r = 0; r < N; r++) {
        for (let c = 0; c < M; c++) {
          if (tempBoard[r][c] === 1) {
            let distance = calculateDistance(N, archer, r, c);
            if (distance <= D) {
              if (
                !target ||
                distance < minDistance ||
                (distance === minDistance && c < target[1])
              ) {
                target = [r, c];
                minDistance = distance;
              }
            }
          }
        }
      }

      if (target) {
        targets.add(target.join(","));
      }
    });

    enemies += targets.size;

    targets.forEach((t) => {
      let [r, c] = t.split(",").map(Number);
      tempBoard[r][c] = 0;
    });

    tempBoard.pop();
    tempBoard.unshift(new Array(M).fill(0));
  }

  return enemies;
}

function maxEnemies(N, M, D, board) {
  let maxKilled = 0;

  function combine(input, len, start, result, output) {
    if (result.length === len) {
      output.push([...result]);
      return;
    }
    for (let i = start; i < input.length; i++) {
      result.push(input[i]);
      combine(input, len, i + 1, result, output);
      result.pop();
    }
  }

  let archerPositions = [];
  let combinations = [];
  for (let i = 0; i < M; i++) archerPositions.push(i);
  combine(archerPositions, 3, 0, [], combinations);

  combinations.forEach((archers) => {
    let killed = simulate(N, M, D, board, archers);
    maxKilled = Math.max(maxKilled, killed);
  });

  return maxKilled;
}
