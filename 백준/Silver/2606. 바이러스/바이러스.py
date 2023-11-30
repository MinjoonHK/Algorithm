N = int(input())
M = int(input())

graph = [[] for _ in range(N+1)]
visited = [False] * (N+1)
for i in range(M):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

counter = 0

def dfs(v):
    global counter
    visited[v] = True
    for i in graph[v]:
        if not visited[i]:
            counter += 1
            dfs(i)
dfs(1)
print(counter)