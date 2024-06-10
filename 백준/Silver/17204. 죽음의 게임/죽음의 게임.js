const fs = require('fs');
let [n, ...number] = fs.readFileSync(0, 'utf-8').toString().trim().split('\n');

let N = Number(n.trim().split(' ')[0]);
let K = Number(n.trim().split(' ')[1]);

class Graph {
  constructor() {
    this.nodes = {};
  }

  addNode(node) {
    this.nodes[node] = this.nodes[node] || [];
  }

  removeNode(node) {
    if (this.contains(node)) {
      while (this.nodes[node].length > 0) {
        this.removeEdge(this.nodes[node][0], node);
      }
      delete this.nodes[node];
    }
  }

  contains(node) {
    return !!this.nodes[node];
  }

  addEdge(from, to) {
    if (!this.contains(from) || !this.contains(to)) return;
    if (!this.hasEdge(from, to)) this.nodes[from].push(to);
  }

  removeEdge(from, to) {
    if (!this.contains(from) || !this.contains(to)) return;
    if (this.hasEdge(from, to)) {
      const index = this.nodes[from].indexOf(to);
      this.nodes[from].splice(index, 1);
    }
  }

  hasEdge(from, to) {
    if (!this.contains(from)) return false;
    return !!this.nodes[from].includes(to);
  }
}

let graph = new Graph();
for (let i = 0; i < N; i++) {
  graph.addNode(i);
}
for (let i = 0; i < N; i++) {
  number[i] = Number(number[i].trim());
  graph.addEdge(i, number[i]);
}

let current = 0;
let M = 0;
let visited = new Array(N).fill(false);
visited[0] = true;
let isImpossible = false;
while (true) {
  if (current === K) break;
  for (let i = 0; i < N; i++) {
    if (graph.hasEdge(current, i) && !visited[i]) {
      current = i;
      visited[i] = true;
      break;
    } else if (graph.hasEdge(current, i) && visited[i]) {
      isImpossible = true;
    }
  }
  if (isImpossible) break;
  M++;
}

if (isImpossible) M = -1;

console.log(M);