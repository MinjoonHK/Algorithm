import sys
from collections import deque

input = sys.stdin.readline

# 2468. 안전 영역
# min ~ max 강수량을 탐색하면서
# graph[i][j] <= 강수량 일때 물에 잠김
# 물에 잠기지 않는 면적의 개수
# 물에 잠기지 않은 지점을 발견하면 bfs 시작
# bfs를 수행할때마다 면적이 1개씩 늘어남

n = int(input())
graph = []
min_value = 100
max_value = 1
for _ in range(n):
    row = list(map(int, input().split()))
    min_value = min(min_value, min(row))
    max_value = max(max_value, max(row))
    graph.append(row)


# 각 행을 입력 받으면서 최소, 최대를 갱신한다.

def bfs(i, j, rain):
    q = deque()
    visited[i][j] = True
    q.append((i, j))
    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]

    while q:
        cur_x, cur_y = q.popleft()
        for i in range(4):
            nx = cur_x + dx[i]
            ny = cur_y + dy[i]
            if nx in range(n) and ny in range(n) and not visited[nx][ny]:
                if graph[nx][ny] > rain:  # 강수량보다 높은 지역(안전한 영역)
                    visited[nx][ny] = True
                    q.append((nx, ny))
    return 1  # BFS가 끝난경우 수행횟수 1 return


rains = range(min_value, max_value + 1)  # 검사해야할 강수량의 범위는 h의 최소~최대
result = []
for rain in rains:
    res = 0
    visited = [[False] * n for _ in range(n)]  # 매 반복마다 visited를 초기화해준다.
    for i in range(n):
        for j in range(n):
            if graph[i][j] > rain and not visited[i][j]:
                res += bfs(i, j, rain)
    result.append(res)

if max(result) == 0:  # 아무 지역도 물에 잠기지 않은 경우(BFS를 수행하지 못한 경우)
    print(1)
else:
    print(max(result))