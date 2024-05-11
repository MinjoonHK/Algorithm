const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let inputLine = 0;
let N = 0;

let board = [];
let hitterArr = Array(9).fill(0);
let visited = Array(9).fill(false);
hitterArr[3] = 1;
visited[3] = true;
let max = 0;

rl.on("line", (line) => {
  if (inputLine == 0) {
    N = parseInt(line);
  }
  if (inputLine > 0 && inputLine <= N) {
    const row = line.split(" ").map((num) => parseInt(num));
    board.push(row);
  }
  if (inputLine == N) {
    solution();
  }
  inputLine++;
});

function solution() {
  combination(2); // 1번 타자는 4번 타자로 고정
  console.log(max);
  process.exit();
}

function play(hitterCombination) {
  //타자 조합을 입력받아 게임 진행
  let base1 = 0; // 1루
  let base2 = 0; // 2루
  let base3 = 0; // 3루
  let outCount = 0; // 아웃카운트
  let hitter = 0; // 타자순서
  let score = 0; // 점수
  function init() {
    // 이닝 초기화
    base1 = 0;
    base2 = 0;
    base3 = 0;
    outCount = 0;
  }
  function hit(v) {
    if (v == 1) {
      //안타라면
      score += base3; // 3루에 주자가 있으면 더하기
      base3 = base2; // 2루 -> 3루
      base2 = base1; // 1루 -> 2루
      base1 = 1; // 1루에 주자 추가
    } else if (v == 2) {
      //2루타라면
      score += base2 + base3; // 2루, 3루에 주자가 있으면 더하기
      base3 = base1; // 1루 -> 3루
      base2 = 1; // 2루에 주자 추가
      base1 = 0; // 1루 초기화
    } else if (v == 3) {
      //3루타라면
      score += base1 + base2 + base3; // 1루, 2루, 3루에 주자가 있으면 더하기
      base3 = 1; // 3루에 주자 추가
      base2 = 0; // 2루 초기화
      base1 = 0; // 1루 초기화
    } else if (v == 4) {
      //홈런이라면
      score += base1 + base2 + base3 + 1; // 1루, 2루, 3루, 홈런
      base3 = 0; // 3루 초기화
      base2 = 0; // 2루 초기화
      base1 = 0; // 1루 초기화
    } else {
      //아웃이라면
      outCount++; // 아웃카운트 증가
    }
  }

  for (let i = 0; i < N; i++) {
    // 이닝 수만큼 반복
    while (outCount < 3) {
      hit(board[i][hitterCombination[hitter % 9] - 1]); // 타자순서에 맞게 타격
      hitter++; // 계속증가 예를들어 13 % 9 이면 4번타자
    }
    if (outCount == 3) {
      //3아웃이라면 이닝 종료
      init(); //베이스 초기화
    }
  }
  return score;
}

function combination(hitterNumber) {
  if (hitterNumber == 10) {
    let score = play(hitterArr);
    max = max < score ? score : max;
    return;
  }
  for (let i = 0; i < 9; i++) {
    if (!visited[i]) {
      visited[i] = true;
      hitterArr[i] = hitterNumber; // 타자순서에 현재 타자 번호 넣기
      combination(hitterNumber + 1); // 다음 타자 재귀 호출
      visited[i] = false; // 새로운 판을 위해 초기화
    }
  }
}
