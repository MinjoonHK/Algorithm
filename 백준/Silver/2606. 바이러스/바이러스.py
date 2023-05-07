T = int(input())
N = int(input())
graph = [[] for _ in range(T+1)]
visited = [0] * (T+1)
for _ in range(N):
    a,b = map(int,input().split())
    graph[a] += [b]
    graph[b] += [a]

def dfs(V):
    visited[V] = 1
    for i in graph[V]:
        if visited[i] == 0:
            dfs(i)
dfs(1)
print(sum(visited)-1)