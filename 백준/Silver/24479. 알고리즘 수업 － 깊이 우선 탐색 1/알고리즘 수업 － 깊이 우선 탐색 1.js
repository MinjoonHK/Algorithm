const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = require('fs').readFileSync(filePath).toString().trim().split('\n');
const [N, M, R] = input.shift().split(' ').map(Number);
const arr = input.map((v) => v.split(' ').map(Number));
const graph = [...Array(N + 1)].map(() => []);
const visited = Array(N).fill(0);
let cnt = 1;

// 무방향(양방향) 그래프 만들기
arr.map(([from, to]) => {
  graph[from].push(to);
  graph[to].push(from);
});

// 오름차순 정렬
graph.map((v) => v.sort((a, b) => a - b));

// DFS
const dfs = (node) => {
  // graph의 0번째 인덱스는 쓰지 않으므로 현재 노드번호에 -1의 방문여부 체크
  if (!visited[node - 1]) {
    // 방문 체크함과 동시에 해당 인덱스의 값은 1씩 증가하는 cnt로 넣어준다.
    visited[node - 1] = cnt;
    cnt++;
    for (const next of graph[node]) dfs(next); // 재귀
  }
};

dfs(R);

console.log(visited.join('\n'));