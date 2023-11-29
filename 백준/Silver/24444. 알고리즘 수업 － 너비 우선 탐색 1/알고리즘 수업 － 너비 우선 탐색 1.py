from collections import deque
import sys

input = sys.stdin.readline

N, M, R = map(int,input().split())

graph = [[] for _ in range(N+1)]
visited = [0] * (N+1)
c = 1

for _ in range(M):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

def bfs(v):
    global c
    queue = deque()
    queue.append(v)
    visited[v] = c
    while queue:
        V = queue.popleft()
        for i in graph[V]:
            if visited[i] == 0:
                c += 1
                visited[i] = c
                queue.append(i)

for i in range(N+1):
    graph[i].sort()

bfs(R)

for j in range(1, N+1):
    print(visited[j])


