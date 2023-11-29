import sys
sys.setrecursionlimit(10 ** 6)
input = sys.stdin.readline

N, M, R = map(int,input().split())

graph = [[] for _ in range(N+1)]
visited = [0] * (N+1)
c = 1

for _ in range(M):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

def dfs(v):
    global c
    visited[v] = c
    for i in graph[v]:
        if visited[i] == 0:
            c += 1
            dfs(i)

for i in range(N+1):
    graph[i].sort()

dfs(R)

for j in range(1, N+1):
    print(visited[j])

