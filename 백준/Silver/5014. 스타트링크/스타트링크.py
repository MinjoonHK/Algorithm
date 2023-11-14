from collections import deque

F,S,G,U,D = map(int,input().split())
visited = [0 for _ in range(F+1)]
counter = [0 for _ in range(F+1)]
# F = 총 층수
# S = 현재 위치
# G = 목적지
# U = 올라가는 층수
# D = 내려가는 층수

def bfs(s):
    queue = deque()
    queue.append(s)
    visited[s] = 1
    while queue:
        s = queue.popleft()
        if s == G: # 만약 층에 도달 했다면
            return counter[G]
        for i in (s+U, s-D): # 층을 플러스 했을 경우 층을 마이너스 했을 경우 동시에
            if 0 < i <= F and not visited[i]: # 만약 i 가 최종층보다 작고 0보단 크며 아직 방문하지 않았다면
                visited[i] = 1 # 해당층을 방문처리
                counter[i] = counter[s] + 1 #층에 도착하기 위해 버튼을 조작한 횟수는 전에 도달한 층에 +1
                queue.append(i)
    if counter[G] == 0: # 목적지 층이 값이 0 즉 도달하지 못했다면
        return "use the stairs"
print(bfs(S))