from collections import deque
n,m,v = map(int,input().split())
graph = [[]for i in range(n+1)]
for i in range(m): #간선의 개수
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)
    graph[a].sort()
    graph[b].sort()

#graph = [[],[2,3,4],[1,4],[1],[1,2]]

def dfs(graph,v,visited):
    visited[v] = True  #방문 node 방문 처리
    print(v,end=' ')
    for j in graph[v]: #graph v 에 있는 node들을 하나씩 방문
        if not visited[j]: # 예를들어 [2,3,4] 중 2가 visited[2] 가 False 라면 => dfs(graph,2,visited) 로 다시 돌리기
            dfs(graph,j,visited)

def bfs(graph,start,visited):
    queue = deque([start])

    visited[start] = True

    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for k in graph[v]:
            if not visited[k]:
                queue.append(k)
                visited[k] = True
visited = [False] * (n+1)
dfs(graph, v, visited)
print("")
visited = [False] * (n+1)
bfs(graph, v, visited)