const solution = (n) => {
  const answer = [];
  const arr = Array.from({ length: n }, () => new Array(n).fill(0));
    //패턴 n = 4라면?
    // [0,0],[1,0],[2,0],[3,0],[3,1],[3,2],[3,3],[3,3],[2,2],[1,1],[2,1];
    //패턴 n = 5라면?
    // [0,0],[1,0],[2,0],[3,0],[4,0],[4,1],[4,2],[4,3],[4,4]...
    //3가지 패턴 1. 행만증가 2.열만증가 3. 행열 -1씩 감소
  const directions = [
    [1, 0],
    [0, 1],
    [-1, -1],
  ];

  let row = -1;
  let col = 0;

  let nowValue = 1;
  let nowDirectionIndex = 0;

  for (let i = n; i > 0; i--) { //4,3,2,1
    const [dRow, dCol] = directions[nowDirectionIndex];

    for (let j = 0; j < i; j++) { // 0,1,2,3 0,1,2 0,1 0
      row += dRow;
      col += dCol;

      arr[row][col] = nowValue; // 1,2,3,4,5...
      nowValue += 1;
    }

    nowDirectionIndex = (nowDirectionIndex + 1) % 3; // 3가지 싸이클을 돌고나서 다시 처음으로
  }

  for (let i = 0; i < n; i += 1) {
    for (let j = 0; j < n; j += 1) {
      if (arr[i][j]) answer.push(arr[i][j]);
    }
  }
  return answer;
};