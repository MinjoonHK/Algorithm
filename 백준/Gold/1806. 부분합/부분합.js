const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let N, S;
let arr;

let inputLine = 0;

rl.on("line", (line) => {
  if (inputLine == 0) {
    N = parseInt(line.split(" ")[0]);
    S = parseInt(line.split(" ")[1]);
  } else if (inputLine == 1) {
    arr = line.split(" ").map((el) => parseInt(el));

    let answer = N + 1; // 초기화를 N+1로 해줌으로써 최소 길이를 찾을 때 사용할 수 있도록 함
    let lo = 0;
    let hi = 0;
    let sum = arr[0]; // 초기 sum 설정
    while (lo <= hi && hi < N) {
      if (sum < S) {
        hi++; // sum이 S보다 작으면 hi를 증가시켜 다음 요소를 포함시킴
        sum += arr[hi]; // hi 위치의 요소를 sum에 추가
      } else {
        answer = Math.min(answer, hi - lo + 1); // 현재 구간 길이와 answer 중 작은 값을 선택하여 answer 갱신
        sum -= arr[lo]; // lo 위치의 요소를 sum에서 제거
        lo++; // lo 증가
      }
    }

    if (answer == N + 1) {
      // 만약 answer가 초기화된 값과 같다면, 즉, 어떠한 구간도 없이 while 루프를 빠져나왔다면
      console.log(0); // 답은 0
    } else {
      console.log(answer);
    }

    process.exit();
  }
  inputLine++;
});
